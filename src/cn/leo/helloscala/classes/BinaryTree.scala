package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/30 1:09
 */
sealed abstract class BinaryTree {

  case class Leaf(value: Int) extends BinaryTree

  case class Node(tree: BinaryTree*) extends BinaryTree

  def leafSum(tree: BinaryTree): Int = {
    tree match {
      case Node(n@_*) => n.map(leafSum).sum
      //      case Node(a, b) => leafSum(a) + leafSum(b)
      case Leaf(v) => v
    }
  }

}
