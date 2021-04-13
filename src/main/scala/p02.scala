import scala.annotation.tailrec

/** Find the last but one element of a list.
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5 */

object p02 extends App {
  def penultimateBuiltIn[A](ls: List[A]): A = ls.init.last

  @tailrec
  def penultimateRecursiveMatch[A](ls: List[A]): A = {
    ls match {
      case h :: _ :: Nil => h
      case _ :: tail => penultimateRecursiveMatch(tail)
      case _ => throw new NoSuchElementException
    }
  }

  val ls = List(1, 1, 2, 3, 5, 8)
  println(penultimateBuiltIn(ls))
  println(penultimateRecursiveMatch(ls))
}
