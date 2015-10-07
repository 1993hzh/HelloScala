package cn.leo.helloscala

import cn.leo.helloscala.classes._

/**
 * Created by Administrator.
 * 2015/9/6 21:08
 */
object Chapter5 {
  def main(args: Array[String]) {
    val counter = new Counter
    counter.increment()
    println(counter.value)
    counter.value = Int.MaxValue
    counter.increment()
    println(counter.value == Int.MaxValue)

    val person = new Person("Fred Smith")
    println(person)

    val employee = new Employee
    println(employee)

    val car = new Car("CREATOR", "AUDI-A6")
    println(car)
  }
}
