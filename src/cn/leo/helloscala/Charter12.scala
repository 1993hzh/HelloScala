package cn.leo.helloscala


/**
 * Created by Administrator.
 * 2015/9/17 21:04
 */
object Charter12 extends App {

  def values(fun: (Int) => Int, low: Int, high: Int): Array[Array[Int]] = {
    val array = Array.ofDim[Int](high - low + 1, 2)
    for (i <- 0 to high - low) {
      val value = low + i
      array(i)(0) = value
      array(i)(1) = value * value
    }
    array
  }

  def getMaxOfArray(array: Array[Int]): Unit = {
    println(array.reduceLeft((a, b) => if (a > b) a else b))
  }

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.reduceLeft((a, b) => if (fun(a) > fun(b)) a else b)
  }

  def adjustToPair(fun: (Int, Int) => Int)(pair: (Int, Int)): Int = {
    fun(pair._1, pair._2)
  }

  def unless(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      unless(condition)(block)
    }
  }

  //  values(x => x * x, -5, 5).foreach(e => e.foreach(println))
  //  getMaxOfArray(Array(2, 3, 1, 5, 9, 1))
  //
  //  println(1 to 100 reduceLeft (_ + _))
  //  println((1 to -10).foldLeft(1)(_ * _))
  //  println(largest(x => 10 * x - x * x, 1 to 10))
  //
  //  println("pairs:")
  //  val pairs = (1 to 10) zip (11 to 20)
  //  for ((a, b) <- pairs) {
  //    println(adjustToPair(_ * _)((a, b)))
  //  }

  var x: Int = 0
  unless(x == 8) {
    x += 1
    println(x)
  }

}
