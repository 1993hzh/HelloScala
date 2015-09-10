package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/10 21:16
 */
class LabelPoint(label: String, x: Int, y: Int) extends Point(x, y) {
  override def toString = x + ", " + y + " ," + label
}
