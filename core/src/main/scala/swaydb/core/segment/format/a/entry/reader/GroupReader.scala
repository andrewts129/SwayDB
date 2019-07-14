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

package swaydb.core.segment.format.a.entry.reader

import swaydb.core.data.Persistent
import swaydb.core.segment.format.a.block.ValuesBlock
import swaydb.core.segment.format.a.block.reader.DecompressedBlockReader
import swaydb.core.segment.format.a.entry.id.{BaseEntryId, KeyValueId}
import swaydb.data.IO
import swaydb.data.slice.Reader

object GroupReader extends EntryReader[Persistent.Group] {

  def apply[T <: BaseEntryId](baseId: T,
                              keyValueId: Int,
                              indexReader: Reader,
                              valueReader: Option[DecompressedBlockReader[ValuesBlock]],
                              indexOffset: Int,
                              nextIndexOffset: Int,
                              nextIndexSize: Int,
                              accessPosition: Int,
                              previous: Option[Persistent])(implicit timeReader: TimeReader[T],
                                                            deadlineReader: DeadlineReader[T],
                                                            valueOffsetReader: ValueOffsetReader[T],
                                                            valueLengthReader: ValueLengthReader[T],
                                                            valueBytesReader: ValueReader[T]): IO[Persistent.Group] =
    deadlineReader.read(indexReader, previous) flatMap {
      deadline =>
        valueBytesReader.read(indexReader, previous) flatMap {
          valueOffsetAndLength =>
            valueOffsetAndLength map {
              case (valueOffset, valueLength) =>
                KeyReader.read(keyValueId, indexReader, previous, KeyValueId.Group) flatMap {
                  case (key, isKeyPrefixCompressed) =>
                    valueReader map {
                      valueReader =>
                        Persistent.Group(
                          key = key,
                          deadline = deadline,
                          valueReader = valueReader,
                          nextIndexOffset = nextIndexOffset,
                          nextIndexSize = nextIndexSize,
                          indexOffset = indexOffset,
                          valueOffset = valueOffset,
                          valueLength = valueLength,
                          accessPosition = accessPosition,
                          isPrefixCompressed =
                            isKeyPrefixCompressed ||
                              timeReader.isPrefixCompressed ||
                              deadlineReader.isPrefixCompressed ||
                              valueOffsetReader.isPrefixCompressed ||
                              valueLengthReader.isPrefixCompressed ||
                              valueBytesReader.isPrefixCompressed
                        )
                    } getOrElse ValuesBlock.valuesBlockNotInitialised
                }
            } getOrElse ValuesBlock.valuesBlockNotInitialised
        }
    }
}
