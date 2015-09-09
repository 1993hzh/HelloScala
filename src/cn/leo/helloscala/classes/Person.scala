package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/6 22:14
 */
//class Person(var age: Int) {
//  age = if (age < 0) 0 else age
//}
class Person(val str: String) {
  private val firstName: String = str.take(str.indexOf(" "))
  private val lastName: String = str.takeRight(str.length - str.indexOf(" ") - 1)

  override def toString(): String = {
    firstName + " " + lastName
  }
}