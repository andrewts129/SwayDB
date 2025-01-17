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

package swaydb

import scala.collection.mutable

protected abstract class ScalaMapBase[K, V, F](db: Map[K, V, F, IO.ApiIO]) extends mutable.Map[K, V] {

  override def get(key: K): Option[V] =
    db.get(key).get

  override def iterator: Iterator[(K, V)] =
    new Iterator[(K, V)] {
      var nextOne: (K, V) = _

      override def hasNext: Boolean =
        if (nextOne == null)
          db.headOption.get exists {
            some =>
              nextOne = some
              true
          }
        else
          db.stream.next(nextOne).get exists {
            some =>
              nextOne = some
              true
          }

      override def next(): (K, V) =
        nextOne
    }

  override def isEmpty: Boolean =
    db.isEmpty.get

  override def nonEmpty: Boolean =
    !isEmpty

  override def headOption: Option[(K, V)] =
    db.headOption.get

  override def lastOption: Option[(K, V)] =
    db.lastOption.get

  override def keySet: collection.Set[K] =
    db.keys.asScala

  override def contains(key: K): Boolean =
    db.contains(key).get

  override def last: (K, V) =
    db.lastOption.get.get

  override def head: (K, V) =
    db.headOption.get.get

  override def clear(): Unit =
    db.clear().get

}
