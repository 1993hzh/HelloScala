package cn.leo.scala.objects

/**
 * Created by Administrator.
 * 2015/9/8 21:08
 */
object Poker extends Enumeration with App {
  val M = Value("♣")
  val T = Value("♠")
  val H = Value("♥")
  val F = Value("♦")

  println(Poker.M)
  println(Poker.T)
  println(Poker.H)
  println(Poker.F)


  def color(color: Poker.Value): String = {
    if (color == Poker.H || color == Poker.F) {
      "RED"
    } else "BLACK"
  }

  println(color(Poker.H))
  println(color(Poker.M))
}
