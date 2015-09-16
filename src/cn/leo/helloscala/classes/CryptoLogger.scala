package cn.leo.helloscala.classes

import cn.leo.helloscala.traits.Logger

/**
 * Created by Administrator.
 * 2015/9/16 22:43
 */
class CryptoLogger extends Logger {
  override def log(msg: String, key: Int): Unit = {
    val str = for (i <- msg) yield if (key >= 0) (97 + ((i - 97 + key) % 26)).toChar else (97 + ((i - 97 + 26 + key) % 26)).toChar
    println(str)
  }
}
