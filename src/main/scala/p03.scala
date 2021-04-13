/** Find the Kth element of a list.
 * By convention, the first element in the list is element 0.
 * Example:
 *
 * scala> nth(2, List(1, 1, 2, 3, 5, 8))
 * res0: Int = 2 */

object p03 extends App {
  def nth[A](n: Int, ls: List[A]): A = {
    (n, ls) match {
      case (0, h :: _) => h
      case (n, h :: tail) => nth(n - 1, tail)
      case _ => throw new NoSuchElementException
    }
  }

  println(nth(2, List(1, 1, 2, 3, 5, 8)))
}
