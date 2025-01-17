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

package swaydb.core.segment.format.a.entry.reader.base

import swaydb.core.data.Persistent
import swaydb.core.segment.format.a.block.ValuesBlock
import swaydb.core.segment.format.a.block.reader.UnblockedReader
import swaydb.core.segment.format.a.entry.id.BaseEntryIdFormatA
import swaydb.core.segment.format.a.entry.reader.EntryReader
import swaydb.data.slice.ReaderBase
import swaydb.data.slice.{ReaderBase, Slice}

private[core] object BaseEntryReader3 extends BaseEntryReader {

  def read[T](baseId: Int,
              keyValueId: Int,
              sortedIndexAccessPosition: Int,
              keyOption: Option[Slice[Byte]],
              indexReader: ReaderBase,
              valuesReader: Option[UnblockedReader[ValuesBlock.Offset, ValuesBlock]],
              indexOffset: Int,
              nextIndexOffset: Int,
              nextIndexSize: Int,
              previous: Option[Persistent],
              reader: EntryReader[T]): T =
  //GENERATED CONDITIONS
    if (baseId == 862)
      reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
    else if (baseId < 862)
      if (baseId == 776)
        reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
      else if (baseId < 776)
        if (baseId == 733)
          reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
        else if (baseId < 733)
          if (baseId == 711)
            reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
          else if (baseId < 711)
            if (baseId == 700)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 700)
              if (baseId == 695)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 695)
                if (baseId == 692)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 692)
                  if (baseId == 690)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 691)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 692)
                  if (baseId == 693)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 694)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 695)
                if (baseId == 698)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 698)
                  if (baseId == 696)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 697)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 698)
                  if (baseId == 699)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 700)
              if (baseId == 706)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 706)
                if (baseId == 703)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 703)
                  if (baseId == 701)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 702)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 703)
                  if (baseId == 704)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 705)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 706)
                if (baseId == 709)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 709)
                  if (baseId == 707)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 708)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 709)
                  if (baseId == 710)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else if (baseId > 711)
            if (baseId == 722)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 722)
              if (baseId == 717)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 717)
                if (baseId == 714)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 714)
                  if (baseId == 712)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 713)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 714)
                  if (baseId == 715)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 716)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 717)
                if (baseId == 720)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 720)
                  if (baseId == 718)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 719)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 720)
                  if (baseId == 721)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 722)
              if (baseId == 728)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 728)
                if (baseId == 725)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 725)
                  if (baseId == 723)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 724)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 725)
                  if (baseId == 726)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 727)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 728)
                if (baseId == 731)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 731)
                  if (baseId == 729)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 730)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 731)
                  if (baseId == 732)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else
            throw swaydb.Exception.InvalidKeyValueId(baseId)
        else if (baseId > 733)
          if (baseId == 755)
            reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
          else if (baseId < 755)
            if (baseId == 744)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 744)
              if (baseId == 739)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 739)
                if (baseId == 736)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 736)
                  if (baseId == 734)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 735)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 736)
                  if (baseId == 737)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 738)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 739)
                if (baseId == 742)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 742)
                  if (baseId == 740)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 741)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 742)
                  if (baseId == 743)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 744)
              if (baseId == 750)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 750)
                if (baseId == 747)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 747)
                  if (baseId == 745)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 746)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 747)
                  if (baseId == 748)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 749)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 750)
                if (baseId == 753)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 753)
                  if (baseId == 751)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 752)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 753)
                  if (baseId == 754)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else if (baseId > 755)
            if (baseId == 766)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 766)
              if (baseId == 761)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 761)
                if (baseId == 758)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 758)
                  if (baseId == 756)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 757)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 758)
                  if (baseId == 759)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 760)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 761)
                if (baseId == 764)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 764)
                  if (baseId == 762)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 763)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 764)
                  if (baseId == 765)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 766)
              if (baseId == 771)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 771)
                if (baseId == 769)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 769)
                  if (baseId == 767)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 768)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 769)
                  if (baseId == 770)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 771)
                if (baseId == 774)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 774)
                  if (baseId == 772)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 773)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 774)
                  if (baseId == 775)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else
            throw swaydb.Exception.InvalidKeyValueId(baseId)
        else
          throw swaydb.Exception.InvalidKeyValueId(baseId)
      else if (baseId > 776)
        if (baseId == 819)
          reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
        else if (baseId < 819)
          if (baseId == 798)
            reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
          else if (baseId < 798)
            if (baseId == 787)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 787)
              if (baseId == 782)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 782)
                if (baseId == 779)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 779)
                  if (baseId == 777)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 778)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 779)
                  if (baseId == 780)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 781)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 782)
                if (baseId == 785)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 785)
                  if (baseId == 783)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 784)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 785)
                  if (baseId == 786)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 787)
              if (baseId == 793)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 793)
                if (baseId == 790)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 790)
                  if (baseId == 788)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 789)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 790)
                  if (baseId == 791)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 792)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 793)
                if (baseId == 796)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 796)
                  if (baseId == 794)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 795)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 796)
                  if (baseId == 797)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else if (baseId > 798)
            if (baseId == 809)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.NoValue.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 809)
              if (baseId == 804)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.NoValue.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 804)
                if (baseId == 801)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 801)
                  if (baseId == 799)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 800)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 801)
                  if (baseId == 802)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 803)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueUncompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 804)
                if (baseId == 807)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.NoValue.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 807)
                  if (baseId == 805)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.NoValue.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 806)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.NoValue.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 807)
                  if (baseId == 808)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.NoValue.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 809)
              if (baseId == 814)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 814)
                if (baseId == 812)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 812)
                  if (baseId == 810)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.NoValue.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 811)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.NoValue.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 812)
                  if (baseId == 813)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 814)
                if (baseId == 817)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 817)
                  if (baseId == 815)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 816)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 817)
                  if (baseId == 818)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else
            throw swaydb.Exception.InvalidKeyValueId(baseId)
        else if (baseId > 819)
          if (baseId == 841)
            reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthFullyCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
          else if (baseId < 841)
            if (baseId == 830)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 830)
              if (baseId == 825)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 825)
                if (baseId == 822)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 822)
                  if (baseId == 820)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 821)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 822)
                  if (baseId == 823)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 824)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 825)
                if (baseId == 828)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 828)
                  if (baseId == 826)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 827)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 828)
                  if (baseId == 829)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 830)
              if (baseId == 836)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthFullyCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 836)
                if (baseId == 833)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 833)
                  if (baseId == 831)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 832)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 833)
                  if (baseId == 834)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 835)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 836)
                if (baseId == 839)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthFullyCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 839)
                  if (baseId == 837)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthFullyCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 838)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthFullyCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 839)
                  if (baseId == 840)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthFullyCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else if (baseId > 841)
            if (baseId == 852)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 852)
              if (baseId == 847)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthUncompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 847)
                if (baseId == 844)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthUncompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 844)
                  if (baseId == 842)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthFullyCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 843)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthFullyCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 844)
                  if (baseId == 845)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthUncompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 846)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthUncompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 847)
                if (baseId == 850)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthUncompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 850)
                  if (baseId == 848)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthUncompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 849)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthUncompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 850)
                  if (baseId == 851)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetOneCompressed.ValueLengthUncompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 852)
              if (baseId == 857)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 857)
                if (baseId == 855)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 855)
                  if (baseId == 853)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 854)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 855)
                  if (baseId == 856)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 857)
                if (baseId == 860)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 860)
                  if (baseId == 858)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 859)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthOneCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 860)
                  if (baseId == 861)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else
            throw swaydb.Exception.InvalidKeyValueId(baseId)
        else
          throw swaydb.Exception.InvalidKeyValueId(baseId)
      else
        throw swaydb.Exception.InvalidKeyValueId(baseId)
    else if (baseId > 862)
      if (baseId == 949)
        reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthThreeCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
      else if (baseId < 949)
        if (baseId == 906)
          reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
        else if (baseId < 906)
          if (baseId == 884)
            reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
          else if (baseId < 884)
            if (baseId == 873)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 873)
              if (baseId == 868)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 868)
                if (baseId == 865)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 865)
                  if (baseId == 863)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 864)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 865)
                  if (baseId == 866)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 867)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthTwoCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 868)
                if (baseId == 871)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 871)
                  if (baseId == 869)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 870)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 871)
                  if (baseId == 872)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 873)
              if (baseId == 879)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 879)
                if (baseId == 876)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 876)
                  if (baseId == 874)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 875)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthThreeCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 876)
                  if (baseId == 877)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 878)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 879)
                if (baseId == 882)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 882)
                  if (baseId == 880)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 881)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 882)
                  if (baseId == 883)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthFullyCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else if (baseId > 884)
            if (baseId == 895)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 895)
              if (baseId == 890)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 890)
                if (baseId == 887)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 887)
                  if (baseId == 885)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 886)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 887)
                  if (baseId == 888)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 889)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 890)
                if (baseId == 893)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 893)
                  if (baseId == 891)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetTwoCompressed.ValueLengthUncompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 892)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 893)
                  if (baseId == 894)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 895)
              if (baseId == 901)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 901)
                if (baseId == 898)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 898)
                  if (baseId == 896)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 897)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 898)
                  if (baseId == 899)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthOneCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 900)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 901)
                if (baseId == 904)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 904)
                  if (baseId == 902)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 903)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 904)
                  if (baseId == 905)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else
            throw swaydb.Exception.InvalidKeyValueId(baseId)
        else if (baseId > 906)
          if (baseId == 928)
            reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
          else if (baseId < 928)
            if (baseId == 917)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 917)
              if (baseId == 912)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 912)
                if (baseId == 909)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 909)
                  if (baseId == 907)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthTwoCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 908)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 909)
                  if (baseId == 910)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 911)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 912)
                if (baseId == 915)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 915)
                  if (baseId == 913)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 914)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthThreeCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 915)
                  if (baseId == 916)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 917)
              if (baseId == 923)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 923)
                if (baseId == 920)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 920)
                  if (baseId == 918)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 919)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 920)
                  if (baseId == 921)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 922)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthFullyCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 923)
                if (baseId == 926)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 926)
                  if (baseId == 924)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 925)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 926)
                  if (baseId == 927)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else if (baseId > 928)
            if (baseId == 939)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthOneCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 939)
              if (baseId == 934)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthOneCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 934)
                if (baseId == 931)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 931)
                  if (baseId == 929)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 930)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetThreeCompressed.ValueLengthUncompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 931)
                  if (baseId == 932)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthOneCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 933)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthOneCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 934)
                if (baseId == 937)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthOneCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 937)
                  if (baseId == 935)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthOneCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 936)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthOneCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 937)
                  if (baseId == 938)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthOneCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 939)
              if (baseId == 944)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthTwoCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 944)
                if (baseId == 942)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthTwoCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 942)
                  if (baseId == 940)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthTwoCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 941)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthTwoCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 942)
                  if (baseId == 943)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthTwoCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 944)
                if (baseId == 947)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthTwoCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 947)
                  if (baseId == 945)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthTwoCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 946)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthTwoCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 947)
                  if (baseId == 948)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthThreeCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else
            throw swaydb.Exception.InvalidKeyValueId(baseId)
        else
          throw swaydb.Exception.InvalidKeyValueId(baseId)
      else if (baseId > 949)
        if (baseId == 992)
          reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
        else if (baseId < 992)
          if (baseId == 971)
            reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthUncompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
          else if (baseId < 971)
            if (baseId == 960)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthFullyCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 960)
              if (baseId == 955)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthThreeCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 955)
                if (baseId == 952)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthThreeCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 952)
                  if (baseId == 950)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthThreeCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 951)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthThreeCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 952)
                  if (baseId == 953)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthThreeCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 954)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthThreeCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 955)
                if (baseId == 958)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthFullyCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 958)
                  if (baseId == 956)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthFullyCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 957)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthFullyCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 958)
                  if (baseId == 959)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthFullyCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 960)
              if (baseId == 966)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthUncompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 966)
                if (baseId == 963)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthFullyCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 963)
                  if (baseId == 961)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthFullyCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 962)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthFullyCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 963)
                  if (baseId == 964)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthUncompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 965)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthUncompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 966)
                if (baseId == 969)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthUncompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 969)
                  if (baseId == 967)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthUncompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 968)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthUncompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 969)
                  if (baseId == 970)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetFullyCompressed.ValueLengthUncompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else if (baseId > 971)
            if (baseId == 982)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 982)
              if (baseId == 977)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 977)
                if (baseId == 974)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 974)
                  if (baseId == 972)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 973)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 974)
                  if (baseId == 975)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 976)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 977)
                if (baseId == 980)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 980)
                  if (baseId == 978)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 979)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthOneCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 980)
                  if (baseId == 981)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 982)
              if (baseId == 987)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 987)
                if (baseId == 985)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 985)
                  if (baseId == 983)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 984)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 985)
                  if (baseId == 986)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthTwoCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 987)
                if (baseId == 990)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 990)
                  if (baseId == 988)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 989)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 990)
                  if (baseId == 991)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else
            throw swaydb.Exception.InvalidKeyValueId(baseId)
        else if (baseId > 992)
          if (baseId == 1014)
            reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
          else if (baseId < 1014)
            if (baseId == 1003)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 1003)
              if (baseId == 998)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 998)
                if (baseId == 995)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 995)
                  if (baseId == 993)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 994)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthThreeCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 995)
                  if (baseId == 996)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 997)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 998)
                if (baseId == 1001)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 1001)
                  if (baseId == 999)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 1000)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 1001)
                  if (baseId == 1002)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthFullyCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 1003)
              if (baseId == 1009)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 1009)
                if (baseId == 1006)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 1006)
                  if (baseId == 1004)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 1005)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 1006)
                  if (baseId == 1007)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 1008)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 1009)
                if (baseId == 1012)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 1012)
                  if (baseId == 1010)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 1011)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.NoTime.ValueFullyCompressed.ValueOffsetUncompressed.ValueLengthUncompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 1012)
                  if (baseId == 1013)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else if (baseId > 1014)
            if (baseId == 1025)
              reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
            else if (baseId < 1025)
              if (baseId == 1020)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 1020)
                if (baseId == 1017)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 1017)
                  if (baseId == 1015)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 1016)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 1017)
                  if (baseId == 1018)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 1019)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthOneCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 1020)
                if (baseId == 1023)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 1023)
                  if (baseId == 1021)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 1022)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 1023)
                  if (baseId == 1024)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else if (baseId > 1025)
              if (baseId == 1030)
                reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineThreeCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
              else if (baseId < 1030)
                if (baseId == 1028)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineOneCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 1028)
                  if (baseId == 1026)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 1027)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthTwoCompressed.DeadlineFullyCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 1028)
                  if (baseId == 1029)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineTwoCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else if (baseId > 1030)
                if (baseId == 1033)
                  reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineSixCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                else if (baseId < 1033)
                  if (baseId == 1031)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineFourCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else if (baseId == 1032)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineFiveCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else if (baseId > 1033)
                  if (baseId == 1034)
                    reader(BaseEntryIdFormatA.FormatA1.KeyStart.TimeUncompressed.ValueUncompressed.ValueOffsetOneCompressed.ValueLengthThreeCompressed.DeadlineSevenCompressed, keyValueId, sortedIndexAccessPosition, keyOption, indexReader, valuesReader, indexOffset, nextIndexOffset, nextIndexSize, previous)
                  else
                    throw swaydb.Exception.InvalidKeyValueId(baseId)
                else
                  throw swaydb.Exception.InvalidKeyValueId(baseId)
              else
                throw swaydb.Exception.InvalidKeyValueId(baseId)
            else
              throw swaydb.Exception.InvalidKeyValueId(baseId)
          else
            throw swaydb.Exception.InvalidKeyValueId(baseId)
        else
          throw swaydb.Exception.InvalidKeyValueId(baseId)
      else
        throw swaydb.Exception.InvalidKeyValueId(baseId)
    else
      throw swaydb.Exception.InvalidKeyValueId(baseId)

  val minID = 690
  val maxID = 1034
}