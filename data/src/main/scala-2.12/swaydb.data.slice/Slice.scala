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

package swaydb.data.slice

import scala.annotation.tailrec
import scala.collection.generic.CanBuildFrom
import scala.collection.{IterableLike, mutable}
import scala.reflect.ClassTag

/**
 * Documentation - http://swaydb.io/slice
 */
object Slice extends SliceCompanionBase {

  class SliceBuilder[T: ClassTag](sizeHint: Int) extends mutable.Builder[T, Slice[T]] {
    //max is used to in-case sizeHit == 0 which is possible for cases where (None ++ Some(Slice[T](...)))
    protected var slice: Slice[T] = Slice.create[T]((sizeHint * 2) max 100)

    def extendSlice(by: Int) = {
      val extendedSlice = Slice.create[T](slice.size * by)
      extendedSlice addAll slice
      slice = extendedSlice
    }

    @tailrec
    final def +=(x: T): this.type =
      try {
        slice add x
        this
      } catch {
        case _: ArrayIndexOutOfBoundsException => //Extend slice.
          extendSlice(by = 2)
          +=(x)
      }

    def clear() =
      slice = Slice.empty[T]

    def result: Slice[T] =
      slice.close()
  }

  implicit def canBuildFrom[T: ClassTag]: CanBuildFrom[Slice[_], T, Slice[T]] =
    new CanBuildFrom[Slice[_], T, Slice[T]] {
      def apply(from: Slice[_]) =
        new SliceBuilder[T](from.size)

      def apply() =
        new SliceBuilder[T](100)
    }
}

/**
 * An Iterable type that holds offset references to an Array without creating copies of the original array when creating
 * sub-slices.
 *
 * @param array      Array to create Slices for
 * @param fromOffset start offset
 * @param toOffset   end offset
 * @param written    items written
 * @tparam T The type of this Slice
 */
class Slice[+T] private[slice](array: Array[T],
                               fromOffset: Int,
                               toOffset: Int,
                               written: Int)(implicit classTag: ClassTag[T]) extends SliceBase[T](array, fromOffset, toOffset, written) with IterableLike[T, Slice[T]] {

  override def selfSlice: Slice[T] =
    this

  override protected[this] def newBuilder: scala.collection.mutable.Builder[T, Slice[T]] =
    new Slice.SliceBuilder[T](array.length max 100)
}