package cn.leo.helloscala

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Buffer
import scala.util.{Sorting, Random}
import scala.collection.JavaConversions.asScalaBuffer

object Chapter3 {

  def main(args: Array[String]) {
    val array = generateRandomArray(10, allowMinus = false)
    array.foreach(a => print(a + ","))
    println
    //    exchangeElements(array).foreach(print)
    //    println
    //    reSortArray(array).foreach(a => print(a + ","))
    //    inverseArray(array).foreach(a => print(a + ","))
    //    trimArray(array).foreach(a => print(a + ","))
    //    getTimeZones.foreach(a => print(a + ","))
    dataTransfer
  }

  def generateRandomArray(n: Int, allowMinus: Boolean = false): Array[Int] = {
    var arrayBuffer = ArrayBuffer[Int]()
    for (i <- 0 until n) {
      arrayBuffer += getValue(Random.nextInt(n), allowMinus)
    }
    arrayBuffer.toArray
  }

  def getValue(value: Int, allowMinus: Boolean): Int = {
    if (Random.nextInt(2) == 0 && allowMinus) -value
    else value
  }

  def exchangeElements(array: Array[Int]): Array[Int] = {
    var temp: Int = 0
    for (i <- Range(0, array.length, 2)) {
      temp = array(i)
      array(i) = array(i + 1)
      array(i + 1) = temp
    }
    array
  }

  def reSortArray(array: Array[Int]): Array[Int] = {
    val arrayBuffer = ArrayBuffer[Int]()
    for (e <- array if e > 0) yield arrayBuffer += e
    for (e <- array if e <= 0) yield arrayBuffer += e
    arrayBuffer.toArray
  }

  def inverseArray(array: Array[Int]): Array[Int] = {
    array.reverse
  }

  def trimArray(array: Array[Int]): Array[Int] = {
    array.distinct
  }

  def getTimeZones(): Array[String] = {
    val ids = java.util.TimeZone.getAvailableIDs
    val temp = for (e <- ids if e.startsWith("America/")) yield e.replaceFirst("America/", "")
    Sorting.quickSort(temp)
    temp
  }

  def dataTransfer(): Unit = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    val buf: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
    println(buf)
  }
}