package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/6 22:38
 */
class Employee {

  private val name: String = "John"
  private val salary: Double = 0.0D

  override def toString(): String = {
    name + ": " + salary
  }
}
