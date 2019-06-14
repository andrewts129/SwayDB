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

package swaydb.core.segment.format.a.entry.generators

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import swaydb.core.segment.format.a.entry.id._
import swaydb.core.segment.format.a.entry.reader.base.BaseEntryReader

import scala.collection.JavaConverters._

/**
  * Generates if conditions for all readers.
  */
object IfConditionGenerator extends App {
  implicit class Implicits(entryId: BaseEntryId) {
    def name =
      entryId.getClass.getName.dropRight(1).replaceAll("swaydb.core.segment.format.a.entry.id.", "").replaceAll("\\$", ".")
  }

  def generateBinarySearchConditions(ids: List[BaseEntryId]): String = {
    if (ids.size == 1) {
      val typedId = ids.head

      val targetFunction =
        s"Some(reader(${typedId.name}, keyValueId, indexReader, valueReader, indexOffset, nextIndexOffset, nextIndexSize, previous))"

      val ifCondition = s"if (baseId == ${typedId.baseId}) \n$targetFunction"

      s"$ifCondition \nelse \nNone"
    } else if (ids.size == 2) {
      val typedId1 = ids.head
      val typedId2 = ids.last

      val targetFunction1 =
        s"Some(reader(${typedId1.name}, keyValueId, indexReader, valueReader, indexOffset, nextIndexOffset, nextIndexSize, previous))"

      val targetFunction2 =
        s"Some(reader(${typedId2.name}, keyValueId, indexReader, valueReader, indexOffset, nextIndexOffset, nextIndexSize, previous))"

      val ifCondition = s"if (baseId == ${typedId1.baseId}) \n$targetFunction1"
      val elseIfCondition = s"else if (baseId == ${typedId2.baseId}) \n$targetFunction2"

      s"$ifCondition \n$elseIfCondition \nelse \nNone"
    } else {
      val mid = ids(ids.size / 2)

      //      println(ids.map(_.id).mkString(", "))
      //      println("Mid:" + mid.id)

      s"if(baseId == ${mid.baseId})" + {
        s"\nSome(reader(${mid.name}, keyValueId, indexReader, valueReader, indexOffset, nextIndexOffset, nextIndexSize, previous))"
      } + {
        s"\nelse if(baseId < ${mid.baseId})\n" +
          generateBinarySearchConditions(ids.takeWhile(_.baseId < mid.baseId))
      } + {
        s"\nelse if(baseId > ${mid.baseId})\n" +
          generateBinarySearchConditions(ids.dropWhile(_.baseId <= mid.baseId))
      } + {
        s"\nelse \nNone"
      }
    }
  }

  def write(fileNumber: Int, ids: List[BaseEntryId]): Unit = {
    val conditions = generateBinarySearchConditions(ids)
    val baseEntryReaderClass = classOf[BaseEntryReader].getSimpleName

    val targetIdClass = Paths.get(s"${System.getProperty("user.dir")}/core/src/main/scala/swaydb/core/segment/format/a/entry/reader/base/$baseEntryReaderClass$fileNumber.scala")
    val allLines = Files.readAllLines(targetIdClass).asScala
    val writer = new PrintWriter(targetIdClass.toFile)

    val conditionStartIndex = allLines.zipWithIndex.find { case (line, index) => line.contains("//GENERATED") }.get._2
    val newLines =
      allLines.take(conditionStartIndex) ++
        Seq("\t//GENERATED CONDITIONS") ++
        Seq(
          conditions,
          s"\n val minID = ${ids.head.baseId}",
          s"val maxID = ${ids.last.baseId}"
        ) ++
        Seq("}")

    writer.write(newLines.mkString("\n"))
    writer.close()
  }

  def keyIdsGrouped: Iterator[(Int, List[BaseEntryIdFormatA])] = {
    val ids = BaseEntryIdFormatA.baseIds
    ids.grouped(ids.size / 4).zipWithIndex map {
      case (entries, index) =>
        index + 1 -> entries
    }
  }

  keyIdsGrouped foreach {
    case (keyCompressionType, ids) =>
      write(keyCompressionType, ids)
  }
}
