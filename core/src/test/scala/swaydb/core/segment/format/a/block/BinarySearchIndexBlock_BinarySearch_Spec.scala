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
package swaydb.core.segment.format.a.block

import org.scalatest.OptionValues._
import swaydb.Error.Segment.ExceptionHandler
import swaydb.IOValues._
import swaydb.core.CommonAssertions._
import swaydb.core.RunThis._
import swaydb.core.TestBase
import swaydb.core.TestData._
import swaydb.core.data.Persistent
import swaydb.core.segment.format.a.block.reader.BlockRefReader
import swaydb.core.util.Bytes
import swaydb.data.order.KeyOrder
import swaydb.data.slice.Slice
import swaydb.{Error, IO}

class BinarySearchIndexBlock_BinarySearch_Spec extends TestBase {

  implicit val keyOrder = KeyOrder.default

  "binarySearch" should {

    "write and search" when {
      def assertSearch(bytes: Slice[Byte],
                       byteSizePerValue: Int,
                       values: Seq[Int]) = {
        val largestValue = values.last

        def matcher(valueToFind: Int, valueFound: Int): IO[swaydb.Error.Segment, KeyMatcher.Result] =
          IO {
            //            //println(s"valueToFind: $valueToFind. valueFound: $valueFound")
            if (valueToFind == valueFound)
              KeyMatcher.Result.Matched(None, null, None)
            else if (valueToFind < valueFound)
              KeyMatcher.Result.AheadOrNoneOrEnd
            else
              KeyMatcher.Result.BehindFetchNext(null)
          }

        def context(valueToFind: Int) =
          new BinarySearchContext {
            override val targetKey: Slice[Byte] = Slice.emptyBytes
            val bytesPerValue: Int = byteSizePerValue
            val valuesCount: Int = values.size
            val isFullIndex: Boolean = true
            val higherOrLower: Option[Boolean] = None
            val lowestKeyValue: Option[Persistent] = None
            val highestKeyValue: Option[Persistent] = None

            def seek(offset: Int): IO[Error.Segment, KeyMatcher.Result] = {
              val foundValue =
                if (bytesPerValue == 4)
                  bytes.take(offset, bytesPerValue).readInt()
                else
                  bytes.take(offset, bytesPerValue).readIntUnsigned().value

              matcher(valueToFind, foundValue)
            }
          }

        values foreach {
          value =>
            BinarySearchIndexBlock.binarySearch(context(value)).value shouldBe a[BinarySearchGetResult.Some[_]]
        }

        //check for items not in the index.
        val notInIndex = (values.head - 100 until values.head) ++ (largestValue + 1 to largestValue + 100)

        notInIndex foreach {
          i =>
            BinarySearchIndexBlock.binarySearch(context(i)).value shouldBe a[BinarySearchGetResult.None[_]]
        }
      }

      "values have the same byte size" in {
        runThis(10.times) {
          Seq(0 to 127, 128 to 300, 16384 to 16384 + 200, Int.MaxValue - 5000 to Int.MaxValue - 1000) foreach {
            values =>
              val valuesCount = values.size
              val largestValue = values.last
              val state =
                BinarySearchIndexBlock.State(
                  largestValue = largestValue,
                  uniqueValuesCount = valuesCount,
                  isFullIndex = true,
                  minimumNumberOfKeys = 0,
                  compressions = _ => Seq.empty
                ).value

              values foreach {
                offset =>
                  BinarySearchIndexBlock.write(value = offset, state = state).value
              }

              BinarySearchIndexBlock.close(state).value

              state.writtenValues shouldBe values.size

              state.bytes.isFull shouldBe true

              Seq(
                BlockRefReader[BinarySearchIndexBlock.Offset](createRandomFileReader(state.bytes)).value,
                BlockRefReader[BinarySearchIndexBlock.Offset](state.bytes)
              ) foreach {
                reader =>
                  val block = BinarySearchIndexBlock.read(Block.readHeader[BinarySearchIndexBlock.Offset](reader).value).value

                  val decompressedBytes = Block.unblock(reader.copy()).value.readFullBlock().value

                  block.valuesCount shouldBe state.writtenValues

                  //byte size of Int.MaxValue is 5, but the index will switch to using 4 byte ints.
                  block.bytesPerValue should be <= 4

                  assertSearch(decompressedBytes, block.bytesPerValue, values)
              }
          }
        }
      }

      "values have distinct byte size" in {
        runThis(10.times) {
          //generate values of uniques sizes.
          val values = (126 to 130) ++ (16384 - 2 to 16384)
          val valuesCount = values.size
          val largestValue = values.last
          val compression = eitherOne(Seq.empty, Seq(randomCompression()))

          val state =
            BinarySearchIndexBlock.State(
              largestValue = largestValue,
              uniqueValuesCount = valuesCount,
              isFullIndex = true,
              minimumNumberOfKeys = 0,
              compressions = _ => compression
            ).value

          values foreach {
            value =>
              BinarySearchIndexBlock.write(value = value, state = state).value
          }
          BinarySearchIndexBlock.close(state).value

          state.writtenValues shouldBe values.size

          Seq(
            BlockRefReader[BinarySearchIndexBlock.Offset](createRandomFileReader(state.bytes)).value,
            BlockRefReader[BinarySearchIndexBlock.Offset](state.bytes)
          ) foreach {
            reader =>
              val block = BinarySearchIndexBlock.read(Block.readHeader[BinarySearchIndexBlock.Offset](reader).value).value

              val decompressedBytes = Block.unblock(reader.copy()).value.readFullBlock().value

              block.bytesPerValue shouldBe Bytes.sizeOf(largestValue)

              block.valuesCount shouldBe values.size

              assertSearch(decompressedBytes, block.bytesPerValue, values)
          }
        }
      }
    }
  }
}
