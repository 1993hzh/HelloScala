package cn.leo.helloscala

import java.util.Random

import scala.collection.mutable.ArrayBuffer

/**
 * Created by leo on 15-10-9.
 */
object Chapter20 {


  def randomArray() = {
    var array = ArrayBuffer[Int]()
    val random = new Random()
    (0 to 1000000).map(array += random.nextInt()).toArray
  }

}
