package cn.leo.helloscala

import cn.leo.helloscala.classes._

/**
 * Created by Administrator.
 * 2015/9/10 20:37
 */
object Chapter8 extends App {

  val ca = new CheckingAccount(100)
  ca.deposit(5)
  println(ca.balance)
  ca.withdraw(5)
  println(ca.balance)

  val sa = new SavingAccount(100)
  sa.deposit(5)
  println(sa.toString)
  sa.withdraw(5)
  println(sa.toString)
  sa.deposit(5)
  println(sa.toString)
  sa.withdraw(5)
  println(sa.toString)
  sa.earnMonthlyInterest()
  sa.deposit(5)
  println(sa.toString)

  val sl1 = new SimpleItem(1, "sl1")
  val sl2 = new SimpleItem(2, "sl2")
  val sl3 = new SimpleItem(3, "sl3")
  val sl4 = new SimpleItem(4, "sl4")
  val bundle = new Bundle()
  bundle.addItem(sl1)
  bundle.addItem(sl2)
  bundle.addItem(sl3)
  bundle.addItem(sl4)
  println(bundle)

  val lp = new LabelPoint("labelPoint", 1, 2)
  println(lp)

  val rectangle: Shape = new Rectangle(5, 3)
  val circle: Shape = new Circle(4)
  println(rectangle.centerPoint)
  println(circle.centerPoint)

  val square = new Square(new java.awt.Point(3, 3), 6)
  println(square)

}
