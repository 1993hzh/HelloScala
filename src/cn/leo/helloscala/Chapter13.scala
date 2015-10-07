package cn.leo.helloscala

import cn.leo.helloscala.traits.MyMkString

import scala.collection.SortedSet
import scala.collection.mutable.HashMap

/**
 * Created by Administrator.
 * 2015/9/17 22:44
 */
object Chapter13 extends App {

  def indexes(str: String): HashMap[Char, SortedSet[Int]] = {
    var map = new HashMap[Char, SortedSet[Int]]()
    var i = 0
    str.foreach(c => {
      map.get(c) match {
        case Some(result) => map(c) = result + i
        case None => map += (c -> SortedSet(i))
      }
      i += 1
    })
    map
  }

  def trimZero(list: List[Int]): List[Int] = {
    list.filter(_ != 0)
  }

  def getWhatever(array: Array[String], map: Map[String, Int]): Array[Int] = {
    array.flatMap(e => map.get(e))
  }

  def splitArray(array: Array[Double], col: Int): Array[Array[Double]] = {
    array.grouped(col).toArray
  }

  println(indexes("Mississippi"))
  println(trimZero(List[Int](1, 4, 2, 0, 5, 1, 0)))
  getWhatever(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)).foreach(e => print(e + " "))

  var a = new collection.mutable.HashSet[String] with MyMkString
  a += "1"
  a += "2"
  a += "3"
  println(a.myMkString)

  val str = "abcacbbcccc"
  val frequencies = str.par.aggregate(Map[Char, Int]())({
    (a, b) => a + (b -> (a.getOrElse(b, 0) + 1))
  }, {
    (map1, map2) => (map1.keySet ++ map2.keySet).foldLeft(Map[Char, Int]()) {
      (result, k) => result + (k -> (map1.getOrElse(k, 0) + map2.getOrElse(k, 0)))
    }
  })

  println(frequencies)
}
