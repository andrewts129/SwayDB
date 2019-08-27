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

package swaydb.core.segment.format.a

import org.scalatest.PrivateMethodTester
import org.scalatest.concurrent.ScalaFutures
import swaydb.core.CommonAssertions._
import swaydb.IOValues._
import swaydb.core.RunThis._
import swaydb.core.TestBase
import swaydb.core.TestData._
import swaydb.core.group.compression.GroupByInternal
import swaydb.core.segment.format.a.block.SegmentBlock
import swaydb.data.order.KeyOrder
import swaydb.data.slice.Slice
import swaydb.data.util.StorageUnits._

class SegmentGroupReadSpec0 extends SegmentGroupReadSpec {
  val keyValuesCount = 1000
}

class SegmentGroupReadSpec1 extends SegmentGroupReadSpec {
  val keyValuesCount = 1000
  override def levelFoldersCount = 10
  override def mmapSegmentsOnWrite = true
  override def mmapSegmentsOnRead = true
  override def level0MMAP = true
  override def appendixStorageMMAP = true
}

class SegmentGroupReadSpec2 extends SegmentGroupReadSpec {
  val keyValuesCount = 1000
  override def levelFoldersCount = 10
  override def mmapSegmentsOnWrite = false
  override def mmapSegmentsOnRead = false
  override def level0MMAP = false
  override def appendixStorageMMAP = false
}

class SegmentGroupReadSpec3 extends SegmentGroupReadSpec {
  val keyValuesCount = 1000
  override def inMemoryStorage = true
}

sealed trait SegmentGroupReadSpec extends TestBase with ScalaFutures with PrivateMethodTester {

  implicit val keyOrder = KeyOrder.default

  def keyValuesCount: Int

  //  override def deleteFiles = false

  "read" in {
    runThis(1.times) {
      implicit val groupBy: Option[GroupByInternal.KeyValues] = Some(randomGroupBy(keyValuesCount))

      val keyValues = randomizedKeyValues(keyValuesCount, startId = Some(0), addGroups = false)
      val segment = TestSegment(keyValues).runRandomIO.right.value

      val segments =
        segment.put(
          newKeyValues = keyValues,
          minSegmentSize = 100.mb,
          removeDeletes = false,
          createdInLevel = 0,
          valuesConfig = keyValues.last.valuesConfig,
          sortedIndexConfig = keyValues.last.sortedIndexConfig,
          binarySearchIndexConfig = keyValues.last.binarySearchIndexConfig,
          hashIndexConfig = keyValues.last.hashIndexConfig,
          bloomFilterConfig = keyValues.last.bloomFilterConfig,
          segmentConfig = SegmentBlock.Config.random
        ).runRandomIO.right.value

      printGroupHierarchy(segments)

      segments should have size 1
      val newSegment = segments.head
      assertReads(keyValues, newSegment)
    }
  }

  "Nested groups" should {
    "read their group's key-values only" in {
      val group1KeyValues = randomizedKeyValues(keyValuesCount, addGroups = false, startId = Some(0))
      val group1 = randomGroup(group1KeyValues)

      val group2KeyValues = randomizedKeyValues(keyValuesCount, startId = Some(group1.maxKey.maxKey.readInt() + 1), addGroups = false)
      val group2 = randomGroup((Slice(group1) ++ group2KeyValues).updateStats)

      val group3KeyValues = randomizedKeyValues(keyValuesCount, startId = Some(group2.maxKey.maxKey.readInt() + 1), addGroups = false)
      val group3 = randomGroup((Slice(group2) ++ group3KeyValues).updateStats)

      val group4KeyValues = randomizedKeyValues(keyValuesCount, startId = Some(group3.maxKey.maxKey.readInt() + 1), addGroups = false)
      val group4 = randomGroup((Slice(group3) ++ group4KeyValues).updateStats)

      val group5KeyValues = randomizedKeyValues(keyValuesCount, startId = Some(group4.maxKey.maxKey.readInt() + 1), addGroups = false)
      val group5 = randomGroup((Slice(group4) ++ group5KeyValues).updateStats)

      //group5 is the root Group.
      val allGroupKeyValues = group1KeyValues ++ group2KeyValues ++ group3KeyValues ++ group4KeyValues ++ group5KeyValues

      val readKeyValues = writeAndRead(Slice(group5)).runRandomIO.right.value

      readKeyValues shouldBe allGroupKeyValues
    }
  }

  //  "Decompressed group" should {
  //    "eventually value uncompressed and update cache" in {
  //      val keyValues = randomizedKeyValues(100, addGroups = false)
  //
  //      implicit val memorySweeper = MemorySweeper(100.bytes, 5.second)
  //
  //      val group: Transient.Group = randomGroup(keyValues)
  //      val segment = TestSegment(Slice(group)).runIO
  //
  //      if (persistent) {
  //        segment.isCacheEmpty shouldBe true
  //
  //        println(segment.segmentSize)
  //
  //        println("*** Reading single key-value ***")
  //        segment.get(keyValues.head.key).runIO shouldBe keyValues.head
  //        assertPostReader()
  //
  //        println("*** Reading all key-values ***")
  //        assertGet(keyValues, segment)
  //        assertPostReader()
  //
  //        def assertPostReader() = {
  //          println("Checking that group is decompressed")
  //          eventual(10.seconds) {
  //            val group = segment.cache.firstEntry().getValue.asInstanceOf[Persistent.Group]
  //            group.isHeaderDecompressed shouldBe true
  //            group.isValueDecompressed shouldBe true
  //            group.isIndexDecompressed shouldBe true
  //            segment.isCacheEmpty shouldBe false
  //          }
  //          println("Checking group should eventually value removed")
  //          eventual(10.seconds) {
  //            segment.isCacheEmpty shouldBe true
  //          }
  //        }
  //      } else {
  //        segment.isCacheEmpty shouldBe false
  //
  //        println(segment.segmentSize)
  //
  //        println("*** Reading single key-value ***")
  //        segment.get(keyValues.head.key).runIO shouldBe keyValues.head
  //        assertPostReader()
  //
  //        println("*** Reading all key-values ***")
  //        assertGet(keyValues, segment)
  //        assertPostReader()
  //
  //        def assertPostReader() = {
  //          println("Checking group should eventually decompressed")
  //          eventual(10.seconds) {
  //            val group = segment.cache.firstEntry().getValue.asInstanceOf[Memory.Group]
  //            group.isHeaderDecompressed shouldBe false
  //            group.isValueDecompressed shouldBe false
  //            group.isIndexDecompressed shouldBe false
  //            segment.isCacheEmpty shouldBe false
  //          }
  //          //Memory Groups are NEVER removed.
  //          println("Checking Memory Group is not removed.")
  //          eventual(10.seconds) {
  //            segment.isCacheEmpty shouldBe false
  //            segment.cache.firstEntry().getValue.isInstanceOf[Memory.Group] shouldBe true
  //          }
  //        }
  //      }
  //
  //      memorySweeper.terminate()
  //    }
  //  }
}
