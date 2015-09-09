package cn.leo.helloscala

import java.io.File
import java.util.Scanner
import scala.collection.mutable
import scala.collection.mutable.HashMap
import scala.collection.JavaConversions.propertiesAsScalaMap

/**
 * Created by Administrator.
 * 2015/9/5 21:30
 */
object Charter4 {
  def main(args: Array[String]): Unit = {
    //    wordCount.foreach(print)
    //    calendarMap
    //    getSystemEnv
    //    val array = Charter3.generateRandomArray(10)
    //    array.foreach(a => print(a + ", "))
    //    println(minmax(array))
    //    println(lteqgt(array, 5))
    println("Hello".zip("World"))
  }

  def wordCount(): HashMap[String, Int] = {
    val map = new HashMap[String, Int]
    def createMap(line: String, map: HashMap[String, Int]): Unit = {
      val word = line.split(" ")
      for (w <- word) {
        map(w) = map.getOrElse(w, 0) + 1
      }
    }
    def strPreProcess(line: String): String = {
      val str = line.replace("\"", " ").replace(", ", " ").replace(".", " ")
      str
    }
    val in = new Scanner(new File(Thread.currentThread().getContextClassLoader().getResource("myFile.txt").getPath))
    while (in.hasNext) {
      val line = in.nextLine()
      createMap(strPreProcess(line), map)
    }
    map
  }

  def calendarMap(): Unit = {
    val map = mutable.LinkedHashMap("Monday" -> java.util.Calendar.MONDAY,
      "Tuesday" -> java.util.Calendar.TUESDAY,
      "Wednesday" -> java.util.Calendar.WEDNESDAY,
      "Thursday" -> java.util.Calendar.THURSDAY,
      "Friday" -> java.util.Calendar.FRIDAY,
      "Saturday" -> java.util.Calendar.SATURDAY,
      "Sunday" -> java.util.Calendar.SUNDAY)
    print(map)
  }

  def getSystemEnv(): Unit = {
    val props: mutable.Map[String, String] = System.getProperties
    props.foreach(println)
  }

  def minmax(values: Array[Int]): HashMap[Int, Int] = {
    var map = new HashMap[Int, Int]()
    map += (values.min -> values.max)
    map
  }

  def lteqgt(values: Array[Int], v: Int): Tuple3[Int, Int, Int] = {
    var lt = 0
    var eq = 0
    var gt = 0
    for (e <- values) {
      if (e < v) lt += 1
      else if (e == v) eq += 1
      else gt += 1
    }
    Tuple3(lt, eq, gt)
  }
}
