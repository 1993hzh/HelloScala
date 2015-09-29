package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/30 1:06
 */
abstract class NewItem {

  def price(item: NewItem): BigDecimal = {
    item match {
      case Multiple(price, _) => price
      case Bundle(_, dis, total@_*) => total.map(price _).sum * dis
      case Article(_, price) => price
    }
  }

  case class Multiple(price: BigDecimal, item: NewItem) extends NewItem

  case class Bundle(description: String, discount: BigDecimal, item: NewItem*) extends NewItem

  case class Article(description: String, price: BigDecimal) extends NewItem


}
