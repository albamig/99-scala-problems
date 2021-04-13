import scala.annotation.tailrec

/** Find the number of elements of a list.
 * Example:
 * scala> length(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 6 */

object p04 extends App {
  def length[A](ls: List[A]): Int = {
    @tailrec
    def loop(ls: List[A], count: Int): Int = {
      if (ls == List()) count
      else loop(ls.tail, count + 1)
    }

    loop(ls, 0)
  }

  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0) { (length, _) => length + 1 }

  println(length(List(1, 1, 2, 3, 5, 8)))
  println(lengthFunctional(List(1, 1, 2, 3, 5, 8)))
}
