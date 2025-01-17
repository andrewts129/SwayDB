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

package swaydb.core.util

import scala.annotation.tailrec

/**
 * A fixed size HashMap that inserts newer key-values to empty spaces or
 * overwrites older key-values if the space is occupied by an older
 * key-value.
 */
private[swaydb] sealed trait LimitHashMap[K, V] extends Iterable[(K, V)] {
  def limit: Int
  def put(key: K, value: V): Unit
  def get(key: K): Option[V]
}

private[swaydb] object LimitHashMap {

  /**
   * A Limit HashMap that tries to insert newer key-values to empty slots
   * or else overwrites older key-values if no slots are free.
   *
   * @param limit    Max number of key-values
   * @param maxProbe Number of re-tries on hash collision.
   */
  def apply[K, V](limit: Int,
                  maxProbe: Int): LimitHashMap[K, V] =
    if (limit <= 0)
      new Empty[K, V]
    else if (maxProbe <= 0)
      new NoProbe[K, V](
        array = new Array[(K, V)](limit)
      )
    else
      new Probed[K, V](
        array = new Array[(K, V)](limit),
        maxProbe = maxProbe
      )

  /**
   * @param limit Max number of key-values
   */
  def apply[K, V](limit: Int): LimitHashMap[K, V] =
    if (limit <= 0)
      new Empty[K, V]
    else
      new NoProbe[K, V](
        array = new Array[(K, V)](limit)
      )

  private class Probed[K, V](array: Array[(K, V)], maxProbe: Int) extends LimitHashMap[K, V] {

    val limit = array.length

    def put(key: K, value: V): Unit = {
      val index = Math.abs(key.##) % limit
      put(key, value, index, index, 0)
    }

    @tailrec
    private def put(key: K, value: V, hashIndex: Int, targetIndex: Int, probe: Int): Unit =
      if (probe == maxProbe) {
        array(hashIndex) = (key, value)
      } else {
        val existing = array(targetIndex)
        if (existing == null || existing._1 == key)
          array(targetIndex) = (key, value)
        else
          put(key, value, hashIndex, if (targetIndex + 1 >= limit) 0 else targetIndex + 1, probe + 1)
      }

    def get(key: K): Option[V] = {
      val index = Math.abs(key.##) % limit
      get(key, index, 0)
    }

    @tailrec
    private def get(key: K, index: Int, probe: Int): Option[V] =
      if (probe == maxProbe) {
        None
      } else {
        val keyValue = array(index)
        if (keyValue != null && keyValue._1 == key)
          Some(keyValue._2)
        else
          get(key, if (index + 1 >= limit) 0 else index + 1, probe + 1)
      }

    override def iterator: Iterator[(K, V)] =
      array.iterator
  }

  private class NoProbe[K, V](array: Array[(K, V)]) extends LimitHashMap[K, V] {

    val limit = array.length

    def put(key: K, value: V) =
      array(Math.abs(key.##) % limit) = (key, value)

    def get(key: K): Option[V] = {
      val value = array(Math.abs(key.##) % limit)
      if (value != null && value._1 == key)
        Some(value._2)
      else
        None
    }

    override def iterator: Iterator[(K, V)] =
      array.iterator
  }

  private class Empty[K, V] extends LimitHashMap[K, V] {
    override def limit: Int = 0
    override def put(key: K, value: V): Unit = ()
    override def get(key: K): Option[V] = None
    override def iterator: Iterator[(K, V)] = Iterator.empty
  }
}
