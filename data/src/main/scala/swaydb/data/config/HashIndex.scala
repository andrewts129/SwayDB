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

package swaydb.data.config

import swaydb.data.api.grouping.Compression

sealed trait HashIndex {
  def toOption =
    this match {
      case HashIndex.Disable => None
      case enable: HashIndex.Enable => Some(enable)
    }
}
object HashIndex {
  case object Disable extends HashIndex
  case class Enable(maxProbe: Int,
                    minimumNumberOfKeys: Int,
                    allocateSpace: HashIndexMeter => Int,
                    cacheOnRead: Boolean,
                    compression: Seq[Compression]) extends HashIndex

  trait HashIndexMeter {
    def requiredSpace: Int
  }
}