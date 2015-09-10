package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/10 21:21
 */
class Rectangle(x: BigDecimal, y: BigDecimal) extends Shape {

  override def centerPoint(): Coordinate = {
    new Coordinate(x / 2, y / 2)
  }
}
