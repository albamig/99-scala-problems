/** Find the last element of a list.
 * Example:
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8 */

import scala.annotation.tailrec

object p01 extends App {
  def lastBuiltIn[A](ls: List[A]): A = ls.last

  @tailrec
  def lastRecursive[A](ls: List[A]): A = {
    if (ls.length == 1) ls.head
    else lastRecursive(ls.tail)
  }

  @tailrec
  def lastRecursiveMatch[A](ls: List[A]): A =
    ls match {
      case h :: Nil => h
      case _ :: tail => lastRecursiveMatch(tail)
      case _ => throw new NoSuchElementException
    }

  val ls = List(1, 1, 2, 3, 5, 8)
  println(lastBuiltIn(ls))
  println(lastRecursive(ls))
  println(lastRecursiveMatch(ls))

}
