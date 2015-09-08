package cn.leo.helloscala.objects


/**
 * Created by Administrator.
 * 2015/9/8 20:43
 */
object Origin extends java.awt.Point with App {
  override def getLocation: java.awt.Point = super.getLocation

  Origin.move(3, 4)
  println(Origin.toString)

}
