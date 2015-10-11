package cn.leo.helloscala

import java.util.Random

import cn.leo.helloscala.classes.{ReactActor, ReceiveActor, MainActor}
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Created by leo on 15-10-9.
 */
object Chapter20 extends App {

  //  val array = randomArray
  //  getAvgSingle(array)
  //  getAvg(array)
  callActor

  def getAvgSingle(array: Array[Int]): Unit = {
    val before = System.nanoTime()
    val sum = BigInt(array.sum)
    val result = sum / array.length
    val after = System.nanoTime()
    println("single   avg: " + result + ", costs time: " + (after - before))
  }

  def getAvg(array: Array[Int]): Unit = {
    val mainActor = new MainActor(array, System.nanoTime())
    mainActor.start()
  }


  def randomArray() = {
    var array = ArrayBuffer[Int]()
    val random = new Random()

    for (i <- Range(0, 200000000))
      array += random.nextInt(100)
    array.toArray
  }

  def callActor(): Unit = {
    val receivePids = new mutable.HashSet[Any]()
    val reactPids = new mutable.HashSet[Any]()

    for (i <- Range(0, 100)) {
      val receive = new ReceiveActor()
      receive.start()
      val receiveResult = receive !! "Hello"
//      receivePids.add(receiveResult())

      val react = new ReactActor()
      react.start()
      val reactorResult = react !! "Hello"
//      reactPids.add(reactorResult())
    }

    receivePids.foreach(e => print(e + ", "))
    println
    reactPids.foreach(e => print(e + ", "))
  }

}
