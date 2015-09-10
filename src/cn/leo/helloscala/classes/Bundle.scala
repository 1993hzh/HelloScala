package cn.leo.helloscala.classes

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator.
 * 2015/9/10 21:02
 */
class Bundle extends Item {

  var items = ArrayBuffer[Item]()

  def addItem(item: Item): Unit = {
    items += item
  }

  override def price(): Double = {
    var total = 0d
    for (i <- items)
      total += i.price
    total
  }

  override def description(): String = {
    items.mkString(" ")
  }
}
