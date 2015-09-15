package cn.leo.helloscala.classes

import scala.beans.BeanProperty
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator.
 * 2015/9/15 22:21
 */
@SerialVersionUID(13L)
class NewPerson(var name: String) extends Serializable {

  @BeanProperty
  var friends = ArrayBuffer[NewPerson]()

  def addFriends(person: NewPerson) = {
    friends += person
  }

  override def toString() = {
    var str = "My name is " + name + " and my friends name are "
    friends.foreach(str += _.name + ",")
    str
  }
}
