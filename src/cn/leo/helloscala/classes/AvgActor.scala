package cn.leo.helloscala.classes


import scala.actors.Actor

/**
 * Created by Administrator.
 * 2015/10/11 19:25
 */
case class ReduceSum(array: Array[Int], mainActor: Actor)

case class CollectSum(sum: BigInt, length: Int)

class AvgActor extends Actor {
  override def act(): Unit = {
    loop {
      react {
        case ReduceSum(array, mainActor) =>
          //          println("return result: " + array.sum)
          mainActor ! CollectSum(array.sum, array.length)
          exit()
      }
    }
  }
}

class MainActor(val array: Array[Int], startTime: Long) extends Actor {

  override def act(): Unit = {
    var sumSum: BigInt = 0
    var done = 0
    callSlave()
    loop {
      receive {
        case CollectSum(sum, length) =>
          done += length
          sumSum += sum
          if (done >= array.length) {
            val result = BigDecimal(sumSum) / array.length
            println("multiple avg: " + result + ", costs time: " + (System.nanoTime() - startTime))
            exit()
          }
      }
    }
  }

  def callSlave() = {
    val cpuCount = Runtime.getRuntime().availableProcessors()
    val avgLength = array.length / cpuCount

    var end = 0
    var allocated = 0
    for (i <- 0 until cpuCount) {
      val avgActor = new AvgActor
      avgActor.start()

      if (allocated >= array.length)
        end = array.length
      else
        end = allocated + avgLength
      //      println("array start from: " + allocated + ", end at: " + end)
      avgActor ! ReduceSum(array.slice(allocated, end), this)
      allocated = end
    }
  }
}
