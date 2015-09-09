package cn.leo.helloscala

/**
 * Created by leo on 15-9-2.
 */
object HelloWorld {
  def main(args: Array[String]) {
    //    println("HelloWorld" * 3)
    //    println(sqrt(3))
    //    println(BigInt(2).pow(2014))
    //    println(BigInt(Random.nextInt()).toString(36))
    //    println(frontAndEnd("dsarewqwe"))
    //    println(frontAndEnd("dsarewqwe", "end"))
    //    println("dsarewqwe".drop(1))
    //    loop(1)
    //    recursiveParam(1 to 10: _*)
    //    loopLess(10)
    getUnicodeOfStr("Hello")
  }

  def frontAndEnd(str: String, method: String = "front"): String = {
    if (method.equalsIgnoreCase("front")) {
      str.take(1)
    } else if (method.equalsIgnoreCase("end")) {
      str.takeRight(1)
    } else {
      ""
    }
  }

  def sqrt(x: Double): Double = {
    def sqrtIter(guess: Double): Double = {
      if (abs(guess * guess - x) < 0.0001) {
        guess
      } else {
        sqrtIter((guess + x / guess) / 2)
      }
    }
    def abs(x: Double): Double = {
      if (x < 0)
        -x
      else
        x
    }
    sqrtIter(1)
  }

  def loop(n: Int): Unit = {
    val vc = for (i <- 0 to n; c <- "Hello") yield (c + i).toChar
    println(vc)
  }

  def recursiveParam(args: Int*): Int = {
    if (args.length == 0) 0
    else {
      println(args.head)
      recursiveParam(args.tail: _*)
    }
  }

  def loopLess(n: Int): Unit = {
    for (i <- Range(n, 0, -1))
      println(i)
    for (i <- 0 to n reverse) {
      println(i)
    }
  }

  def getUnicodeOfStr(str: String, isLoop: Boolean = false): Unit = {
    var long: Long = 1
    if (isLoop) {
      for (c <- str)
        long *= c.toLong
      println(long)
    } else {
      str.foreach(long *= _.toLong)
      println(long)
    }
  }
}
