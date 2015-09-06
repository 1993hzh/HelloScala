package cn.leo.scala.clazz

/**
 * Created by Administrator.
 * 2015/9/6 21:56
 */
class Time(val hours: Byte, val minutes: Byte) {

  def before(other: Time): Boolean = {
    if (other.hours < this.hours || other.hours == this.hours && other.minutes < this.minutes) {
      false
    } else {
      true
    }
  }

  //  def hour_=(hour: Byte) = {
  //    if (hour < 0) {
  //      hours = 0
  //    } else if (hour > 23) {
  //      hours = 23
  //    } else {
  //      hours = hour
  //    }
  //  }
  override def toString(): String = {
    //    hours + ":" + minutes
    hours * 60 + minutes toString
  }
}
