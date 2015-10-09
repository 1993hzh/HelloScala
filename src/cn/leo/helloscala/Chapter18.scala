package cn.leo.helloscala

import cn.leo.helloscala.classes.{then, show, BugWithFluent, Bug, around}

/**
 * Created by leo on 15-10-9.
 */
object Chapter18 extends App {
  val bugsy = new Bug()
  bugsy.move(4).show().move(6).show().turn().move(5).show

  val bugsy1 = new BugWithFluent
  bugsy1 move 4 and show and then move 6 and show turn around move 5 and show

  println(getIndex(Seq(2, 3, 4, 5, -2, -3), 1))

  printValues((x: Int) => x * x, 3, 6)
  printValues(Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), 3, 6)

  val b = new B with C with A
  println("new B " + b.k)


  def getIndex(array: Seq[Int], v: Int): Int Either Int = {
    if (array.contains(v)) {
      Left(array.indexOf(v))
    } else {
      Right(array.indexOf(array.reduce((a, b) => {
        if (math.abs(v - a) > math.abs(v - b))
          b
        else
          a
      })))
    }
  }

  def tryWithClose[T <: {def close() : Unit}](obj: T, func: T => Unit) = {
    try {
      func(obj)
    } finally {
      obj.close()
    }
  }

  def printValues(f: {def apply(i: Int): Int}, from: Int, to: Int) = {
    for (i <- from to to) {
      print(f.apply(i) + " ")
    }
  }

  trait A {
    def sing() = "from a"
  }

  trait C {
    this: A =>
    val w = sing + "from c"
  }

  class B {
    this: C =>
    val k = w
  }

}
