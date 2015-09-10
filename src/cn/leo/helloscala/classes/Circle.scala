package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/10 21:26
 */
class Circle(r: BigDecimal) extends Shape {
  override def centerPoint(): Coordinate = {
    new Coordinate(r, r)
  }
}
