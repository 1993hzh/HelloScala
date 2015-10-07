package cn.leo.helloscala

import java.io._

import cn.leo.helloscala.classes.NewPerson

import scala.io.Source

/**
 * Created by Administrator.
 * 2015/9/15 20:55
 */
object Chapter9 {

  def main(args: Array[String]) {
    //    reverseFileLine(this.getClass.getResource("/").getPath + "myFile.txt")
    //    getLengthGt12(this.getClass.getResource("/").getPath + "myFile.txt")
    //    calculateDouble(this.getClass.getResource("/").getPath + "double.txt")
    //    writeToFile(this.getClass.getResource("/").getPath + "write.txt")
    //    val path = Boolean.getClass.getClassLoader.getResource("").getPath
    //    subdirs(new File(path)).foreach(println)
    personSerial
  }

  def reverseFileLine(file: String): Unit = {
    val lines = Source.fromFile(file).getLines()
    lines.toArray.reverse.foreach(println)
  }

  def getLengthGt12(file: String): Unit = {
    Source.fromFile(file).mkString.split("\\s+").foreach(word => if (word.length > 12) println(word))
  }

  def calculateDouble(file: String): Unit = {
    val array = Source.fromFile(file).mkString.split("\\s+")
    val numbers = for (e <- array) yield e.toDouble
    numbers.foreach(e => print(e + " "))
    println()
    println(numbers.sum)
    println(numbers.sum / numbers.length)
    println(numbers.max)
    println(numbers.min)
  }

  def writeToFile(file: String): Unit = {
    val out = new FileWriter(file)
    try
      for (i <- 0 to 20) {
        val value = BigDecimal(2).pow(i)
        out.write(value + "\t\t" + 1 / value + "\n")
        println(value + "\t\t" + 1 / value)
      }
    finally {
      out.close()
    }
  }

  def subdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles().filter(_.getName.endsWith("class"))
    children.toIterator ++ dir.listFiles().filter(_.isDirectory).toIterator.flatMap(subdirs)
  }

  def personSerial(): Unit = {
    val a: NewPerson = new NewPerson("a")
    val b: NewPerson = new NewPerson("b")
    val c: NewPerson = new NewPerson("c")
    a.addFriends(b)
    a.addFriends(c)

    val out = new ObjectOutputStream(new FileOutputStream(this.getClass.getResource("/").getPath + "person.txt"))
    out.writeObject(a)
    out.close()

    val in = new ObjectInputStream(new FileInputStream(this.getClass.getResource("/").getPath + "person.txt"))
    val p = in.readObject().asInstanceOf[NewPerson]
    println(p)
  }
}
