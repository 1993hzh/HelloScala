package cn.leo.helloscala

import cn.leo.helloscala.classes.{Fraction}

/**
 * Created by leo on 15-10-12.
 */
object Chapter21 extends App {

  println(120 +% 10)
  println(5 !)

  //  println(new Fraction(3, 4) - new Fraction(3, 4))
  println(smaller(Fraction(3, 7), Fraction(2, 9)))
  println(smaller(Fraction(1, 7), Fraction(2, 9)))

  println("abc".map(_.toUpper))
  println("abc".map(_.toInt))


  implicit final class Percent2Int(private val initial: Int) {
    def +%(percent: Int): Int = {
      initial + initial * (BigDecimal(percent) / 100) toInt
    }
  }

  implicit final class Factorial(private val initial: Int) {
    def !(): Int = {
      var result = 1
      for (i <- 1 to initial)
        result *= i
      result
    }
  }

  def smaller[T](a: T, b: T)(implicit order: T => Ordered[T]) = {
    if (a < b) a
    else b
  }

  implicit class RichFraction(fraction: Fraction) extends Ordered[Fraction] {

    override def compare(that: Fraction): Int = {
      (fraction - that).compare()
    }

  }

}
