package swaydb.core.util

import swaydb.core.RunThis._
import swaydb.core.{TestBase, TestTimer}
import swaydb.serializers.Default._
import swaydb.serializers._

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.Random

class ReserveRangeSpec extends TestBase {

  implicit val ordering = swaydb.data.order.KeyOrder.default
  implicit val timer = TestTimer.Empty

  "ReserveRange" should {
    "reserve a ranges and not allow overwrite until freed" in {
      implicit val state = ReserveRange.create[String]()
      ReserveRange.reserveOrGet(1, 10, "first") shouldBe empty

      ReserveRange.get(1, 10) should contain("first")
      ReserveRange.reserveOrGet(1, 10, "does not register") should contain("first")

      (0 to 10) foreach {
        i =>
          //check all overlapping keys are not allowed (0, 1)
          ReserveRange.reserveOrGet(i, i + 1, "does not register") should contain("first")
      }
    }

    "complete futures when freed" in {
      implicit val state = ReserveRange.create[String]()
      ReserveRange.reserveOrGet(1, 10, "first") shouldBe empty

      val futures =
        (0 to 10) map {
          i =>
            ReserveRange.reserveOrListen(1, 10, "does not register").left.get map {
              _ =>
                i
            }
        }

      Future {
        sleep(Random.nextInt(1000).millisecond)
        ReserveRange.free(1)
      }

      Future.sequence(futures).await shouldBe (0 to 10)
      state.ranges shouldBe empty
    }

    "return unreserved if empty" in {
      implicit val state = ReserveRange.create[String]()

      (0 to 100) foreach {
        i =>
          ReserveRange.isUnreserved(i, i + 1) shouldBe true
      }
    }

    "return reserved and unreserved" in {
      implicit val state = ReserveRange.create[String]()
      ReserveRange.reserveOrGet(10, 20, "first") shouldBe empty

      (0 to 8) foreach {
        i =>
          ReserveRange.isUnreserved(i, i + 1) shouldBe true
      }

      (9 to 20) foreach {
        i =>
          ReserveRange.isUnreserved(i, i + 1) shouldBe false
      }

      (21 to 18) foreach {
        i =>
          ReserveRange.isUnreserved(i, i + 1) shouldBe true
      }
    }
  }
}
