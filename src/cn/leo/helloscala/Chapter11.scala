package cn.leo.helloscala

import cn.leo.helloscala.classes.{Fraction, Money, Matrirx}

/**
 * Created by Administrator.
 * 2015/9/16 23:20
 */
object Chapter11 extends App {

  println(new Fraction(15, -6).toString)

  println(Money(1, 75) + Money(0, 50) == Money(2, 25))
  println(Money(1, 75) + Money(0, 50) < Money(3, 25))

  println(Matrirx(3, 4))
}
