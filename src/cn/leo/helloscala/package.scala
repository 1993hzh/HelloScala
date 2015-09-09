package cn.leo

/**
 * Created by Administrator.
 * 2015/9/8 23:39
 */
package object helloscala {
  val a = BigDecimal(664525)
  val b = BigDecimal(1013904223)
  val n = 32
  private var privateSeed: Int = _

  def nextInt(): Int = {
    val temp = (seed * a + b) % BigDecimal(2).pow(n)
    seed = temp.toInt
    seed
  }

  def nextDouble(): Double = {
    val temp = (seed * a + b) % BigDecimal(2).pow(n)
    seed = temp.toInt
    temp.toDouble
  }

  def seed = privateSeed

  def seed_=(newSeed: Int): Unit = {
    privateSeed = newSeed
  }
}
