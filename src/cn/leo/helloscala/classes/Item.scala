package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/10 20:58
 */
abstract class Item {

  def price(): Double

  def description(): String

  override def toString = s"Item($price, $description)"
}
