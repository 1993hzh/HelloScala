package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/6 22:42
 */
class Car(val creator: String, val typeName: String, val year: Int = -1, var num: String = "") {

  override def toString = s"Car($creator, $typeName, $year, $num)"
}
