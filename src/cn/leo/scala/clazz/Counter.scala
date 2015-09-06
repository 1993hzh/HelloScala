package cn.leo.scala.clazz

/**
 * Created by Administrator.
 * 2015/9/6 21:11
 */
class Counter {
  private var privateValue = 0

  def value = privateValue

  def value_=(newValue: Long): Unit = {
    privateValue = newValue.toInt
  }

  def increment(): Unit = {
    if (privateValue < Int.MaxValue) privateValue += 1
    else privateValue = Int.MaxValue
  }
}
