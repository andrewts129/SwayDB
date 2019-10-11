/*
 * Copyright (c) 2019 Simer Plaha (@simerplaha)
 *
 * This file is a part of SwayDB.
 *
 * SwayDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * SwayDB is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with SwayDB. If not, see <https://www.gnu.org/licenses/>.
 */

package swaydb.java.memory

import java.util.concurrent.ExecutorService
import java.util.{Comparator, Optional}

import swaydb.data.accelerate.{Accelerator, LevelZeroMeter}
import swaydb.data.order.KeyOrder
import swaydb.data.slice.Slice
import swaydb.data.util.Functions
import swaydb.data.util.StorageUnits._
import swaydb.java.IO
import swaydb.java.data.slice.ByteSlice
import swaydb.java.data.util.Java.{JavaFunction, _}
import swaydb.java.serializers.{SerializerConverter, Serializer => JavaSerializer}
import swaydb.serializers.Serializer
import swaydb.{SwayDB, Tag}

import scala.beans.BeanProperty
import scala.compat.java8.DurationConverters._
import scala.compat.java8.FunctionConverters._
import scala.concurrent.ExecutionContext
import scala.concurrent.duration._
import scala.reflect.ClassTag

object Map {

  class Config[K, V, F](@BeanProperty var mapSize: Int = 4.mb,
                        @BeanProperty var segmentSize: Int = 2.mb,
                        @BeanProperty var memoryCacheSize: Int = 500.mb,
                        @BeanProperty var maxOpenSegments: Int = 100,
                        @BeanProperty var maxCachedKeyValuesPerSegment: Int = 10,
                        @BeanProperty var fileSweeperPollInterval: java.time.Duration = 10.seconds.toJava,
                        @BeanProperty var mightContainFalsePositiveRate: Double = 0.01,
                        @BeanProperty var deleteSegmentsEventually: Boolean = true,
                        @BeanProperty var acceleration: JavaFunction[LevelZeroMeter, Accelerator] = (Accelerator.noBrakes() _).asJava,
                        @BeanProperty var bytesComparator: Comparator[ByteSlice] = swaydb.java.SwayDB.defaultComparator,
                        @BeanProperty var typedComparator: Optional[Comparator[K]] = Optional.empty[Comparator[K]](),
                        @BeanProperty var fileSweeperExecutorService: ExecutorService = SwayDB.defaultExecutorService,
                        keySerializer: Serializer[K],
                        valueSerializer: Serializer[V],
                        functionClassTag: ClassTag[F]) {

    implicit def scalaKeyOrder: KeyOrder[Slice[Byte]] =
      if (typedComparator.isPresent)
        KeyOrder(
          new Ordering[Slice[Byte]] {
            val typedOrder = typedComparator.get()

            override def compare(left: Slice[Byte], right: Slice[Byte]): Int = {
              val leftKey = keySerializer.read(left)
              val rightKey = keySerializer.read(right)
              typedOrder.compare(leftKey, rightKey)
            }
          }
        )
      else
        KeyOrder(
          new Ordering[Slice[Byte]] {
            override def compare(left: Slice[Byte], right: Slice[Byte]): Int =
              bytesComparator.compare(ByteSlice(left), ByteSlice(right))
          }
        )

    implicit def fileSweeperEC: ExecutionContext = fileSweeperExecutorService.asScala

    def create(): IO[Throwable, swaydb.java.MapIO[K, V, F]] =
      IO.fromScala(
        swaydb.IO {
          val scalaMap =
            swaydb.memory.Map[K, V, F, swaydb.IO.ThrowableIO](
              mapSize = mapSize,
              segmentSize = segmentSize,
              memoryCacheSize = memoryCacheSize,
              maxOpenSegments = maxOpenSegments,
              maxCachedKeyValuesPerSegment = maxCachedKeyValuesPerSegment,
              fileSweeperPollInterval = fileSweeperPollInterval.toScala,
              mightContainFalsePositiveRate = mightContainFalsePositiveRate,
              deleteSegmentsEventually = deleteSegmentsEventually,
              acceleration = acceleration.asScala
            )(keySerializer = keySerializer,
              valueSerializer = valueSerializer,
              functionClassTag = functionClassTag,
              tag = Tag.throwableIO,
              keyOrder = scalaKeyOrder,
              fileSweeperEC = fileSweeperEC
            ).get

          swaydb.java.MapIO[K, V, F](scalaMap)
        }
      )
  }

  def configFunctions[K, V, F](keySerializer: JavaSerializer[K],
                               valueSerializer: JavaSerializer[V]): Config[K, V, F] =
    new Config(
      keySerializer = SerializerConverter.toScala(keySerializer),
      valueSerializer = SerializerConverter.toScala(valueSerializer),
      functionClassTag = ClassTag.Any.asInstanceOf[ClassTag[F]]
    )

  def config[K, V](keySerializer: JavaSerializer[K],
                   valueSerializer: JavaSerializer[V]): Config[K, V, Functions.Disabled] =
    new Config(
      keySerializer = SerializerConverter.toScala(keySerializer),
      valueSerializer = SerializerConverter.toScala(valueSerializer),
      functionClassTag = ClassTag.Nothing.asInstanceOf[ClassTag[Functions.Disabled]]
    )
}
