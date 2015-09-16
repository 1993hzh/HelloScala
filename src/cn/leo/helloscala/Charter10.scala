package cn.leo.helloscala

import java.awt.geom.Ellipse2D.Double

import cn.leo.helloscala.classes.CryptoLogger
import cn.leo.helloscala.traits.{PropertyChange, RectangleLike}

/**
 * Created by Administrator.
 * 2015/9/16 22:10
 */
object Charter10 extends App {

  val egg = new Double(5, 10, 20, 30) with RectangleLike
  println(egg)
  egg.translate(10, -10)
  println(egg)
  egg.grow(10, 20)
  println(egg)

  val msg = "AccIdent"
  new CryptoLogger().log(msg)
  new CryptoLogger().log(msg, -3)

}
