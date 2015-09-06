package cn.leo.scala.clazz

import scala.beans.BeanProperty

/**
 * Created by Administrator.
 * 2015/9/6 22:08
 */
class Student {
  //javap -verbose Student.class

  @BeanProperty var name: String = _
  @BeanProperty var id: Long = _
}
