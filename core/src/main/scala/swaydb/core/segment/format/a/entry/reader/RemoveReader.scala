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

import swaydb.Error.Segment.ExceptionHandler
import swaydb.IO
import swaydb.core.cache.Cache
import swaydb.core.data.Persistent
import swaydb.core.data.Persistent.Partial.Key
import swaydb.core.segment.format.a.block.ValuesBlock
import swaydb.core.segment.format.a.block.reader.UnblockedReader
import swaydb.core.segment.format.a.entry.id.{BaseEntryId, KeyValueId}
import swaydb.data.slice.ReaderBase

object RemoveReader extends SortedIndexEntryReader[Persistent.Remove] {

  def apply[T <: BaseEntryId](baseId: T,
                              keyValueId: Int,
                              accessPosition: Int,
                              keyInfo: Option[Either[Int, Persistent.Partial.Key]],
                              indexReader: ReaderBase[swaydb.Error.Segment],
                              valueCache: Option[Cache[swaydb.Error.Segment, ValuesBlock.Offset, UnblockedReader[ValuesBlock.Offset, ValuesBlock]]],
                              indexOffset: Int,
                              nextIndexOffset: Int,
                              nextIndexSize: Int,
                              previous: Option[Persistent.Partial])(implicit timeReader: TimeReader[T],
                                                                    deadlineReader: DeadlineReader[T],
                                                                    valueOffsetReader: ValueOffsetReader[T],
                                                                    valueLengthReader: ValueLengthReader[T],
                                                                    valueBytesReader: ValueReader[T]): IO[swaydb.Error.Segment, Persistent.Remove] =
    deadlineReader.read(indexReader, previous) flatMap {
      deadline =>
        timeReader.read(indexReader, previous) flatMap {
          time =>
            keyInfo match {
              case Some(keyInfo) =>
                keyInfo match {
                  case Left(keySize) =>
                    KeyReader.read(
                      keyValueIdInt = keyValueId,
                      indexReader = indexReader,
                      keySize = Some(keySize),
                      previous = previous,
                      keyValueId = KeyValueId.Remove
                    ) map {
                      case (key, isKeyPrefixCompressed) =>
                        Persistent.Remove(
                          _key = key,
                          indexOffset = indexOffset,
                          nextIndexOffset = nextIndexOffset,
                          nextIndexSize = nextIndexSize,
                          deadline = deadline,
                          accessPosition = accessPosition,
                          _time = time,
                          isPrefixCompressed =
                            isKeyPrefixCompressed ||
                              timeReader.isPrefixCompressed ||
                              deadlineReader.isPrefixCompressed ||
                              valueOffsetReader.isPrefixCompressed ||
                              valueLengthReader.isPrefixCompressed ||
                              valueBytesReader.isPrefixCompressed
                        )
                    }

                  case Right(key) =>
                    key match {
                      case fixed: Key.Fixed =>
                        IO.Right {
                          Persistent.Remove(
                            _key = fixed.key,
                            indexOffset = indexOffset,
                            nextIndexOffset = nextIndexOffset,
                            nextIndexSize = nextIndexSize,
                            deadline = deadline,
                            accessPosition = accessPosition,
                            _time = time,
                            isPrefixCompressed =
                              timeReader.isPrefixCompressed ||
                                deadlineReader.isPrefixCompressed ||
                                valueOffsetReader.isPrefixCompressed ||
                                valueLengthReader.isPrefixCompressed ||
                                valueBytesReader.isPrefixCompressed
                          )
                        }
                      case key @ (_: Key.Range | _: Key.Group) =>
                        IO.failed(s"Expected Fixed key. Actual: ${key.getClass.getSimpleName}")
                    }
                }
              case None =>
                KeyReader.read(
                  keyValueIdInt = keyValueId,
                  indexReader = indexReader,
                  keySize = None,
                  previous = previous,
                  keyValueId = KeyValueId.Remove
                ) map {
                  case (key, isKeyPrefixCompressed) =>
                    Persistent.Remove(
                      _key = key,
                      indexOffset = indexOffset,
                      nextIndexOffset = nextIndexOffset,
                      nextIndexSize = nextIndexSize,
                      deadline = deadline,
                      accessPosition = accessPosition,
                      _time = time,
                      isPrefixCompressed =
                        isKeyPrefixCompressed ||
                          timeReader.isPrefixCompressed ||
                          deadlineReader.isPrefixCompressed ||
                          valueOffsetReader.isPrefixCompressed ||
                          valueLengthReader.isPrefixCompressed ||
                          valueBytesReader.isPrefixCompressed
                    )
                }
            }
        }
    }
}
