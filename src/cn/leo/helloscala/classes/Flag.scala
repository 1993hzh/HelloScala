package cn.leo.helloscala.classes

import scala.beans.BooleanBeanProperty

/**
 * Created by leo on 15-10-7.
 */
class Flag {

  @BooleanBeanProperty
  @volatile
  var flag: Boolean = false

}
