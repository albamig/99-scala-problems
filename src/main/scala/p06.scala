/** Find out whether a list is a palindrome.
 * Example:
 * scala> isPalindrome(List(1, 2, 3, 2, 1))
 * res0: Boolean = true */

object p06 extends App {
  def isPalindrome[A](ls: List[A]): Boolean = {
    ls match {
      case h :: Nil => true
      case h :: t :: Nil => if (h == t) true else false
      case h :: tail => if (h == tail.last) isPalindrome(tail.init) else false
    }
  }

  println(isPalindrome(List(1, 2, 3, 2, 1)))
}
