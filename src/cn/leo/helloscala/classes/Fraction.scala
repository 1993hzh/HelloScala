package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/16 23:21
 */
class Fraction(n: Int, d: Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

  override def toString = num + "/" + den

  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

  def gcd(a: Int, b: Int): Int = if (b == 0) Math.abs(a) else gcd(b, a % b)

  def +(other: Fraction): Fraction = {
    newFrac((this.num * other.den) + (other.num * this.den), this.den * other.den)
  }

  def -(other: Fraction): Fraction = {
    newFrac((this.num * other.den) - (other.num * this.den), this.den * other.den)
  }

  def *(other: Fraction): Fraction = {
    newFrac(this.num * other.num, this.den * other.den)
  }

  def /(other: Fraction): Fraction = {
    newFrac(this.num * other.den, this.den * other.num)
  }

  private def newFrac(a: Int, b: Int): Fraction = {
    val x: Int = if (b == 0) 1 else a * sign(b) / gcd(a, b);
    val y: Int = if (b == 0) 0 else b * sign(b) / gcd(a, b);
    new Fraction(x, y)
  }


  def compare(that: Int = 0): Int = {
    if (num < that) -1
    else if (num == that) 0
    else 1
  }


}

object Fraction {
  def apply(n: Int, d: Int): Fraction = {
    new Fraction(n, d)
  }
}
