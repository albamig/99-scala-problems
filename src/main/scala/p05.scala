/** Reverse a list.
 * Example:
 * scala> reverse(List(1, 1, 2, 3, 5, 8))
 * res0: List[Int] = List(8, 5, 3, 2, 1, 1) */

object p05 extends App {
  def reverseFunctional[A](ls: List[A]): List[A] = ls.foldLeft(List[A]()) { (res, head) => head :: res }

  def reverseIterative[A](ls: List[A]): List[A] = {
    var res = List[A]()
    for (el <- ls) {
      res = el :: res
    }
    res
  }

  println(reverseFunctional(List(1, 1, 2, 3, 5, 8)))
  println(reverseIterative(List(1, 1, 2, 3, 5, 8)))
}
