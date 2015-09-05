package cn.leo.scala

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object HelloScala {

  def main(args: Array[String]) {
    getRandomArray(10)
  }

  def getRandomArray(n: Int): Unit = {
    val temp = generateRandomArray(n)
    for (i <- temp) println(i)
  }

  def generateRandomArray(n: Int): Array[Int] = {
    var arrayBuffer = ArrayBuffer[Int]()
    for (i <- 0 until n) {
      arrayBuffer += Random.nextInt(n)
    }
    arrayBuffer.toArray
  }
}