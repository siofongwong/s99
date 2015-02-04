import org.scalatest._
import Practice._
import org.scalatest.Assertions._

class ExampleSpec extends FlatSpec with Matchers {

  "P01: Last(List)" should "return the last element of a list" in {
    val list = List (1, 2, 3, 4, 5)
    last(list) should be (5)
    val list2 = List("a", "b", "c")
    last(list2) should be ("c")
  }

  "P02: Penultimate(List)" should "return the last but one element" in {
    val list = List(1,1,2,3,5,8)
    penultimate(list) should be (5)
    val list2 = List("a", "b", "c")
    penultimate(list2) should be ("b")
  }

  "P03: nth(List)" should "return the Kth element of a list" in {
    val list = List(1,1,2,3,4)
    nth(3, list) should be (3)
  }

  "P04: length(List)" should "return the number of elements of a list" in {
    val list = List(1,2,3,4,5,6,7,8,9)
    val list2 = List()
    Practice.length(list) should be (8)
    Practice.length(list2) should be (0)
  }

  "P05: reverse(List)" should "reverse a list" in {
    val list = List(1,2,3,4,5)
    reverse(list) should be (List(5,4,3,2,1))
  }

  "P06: isPalindrome(List)" should "return correct boolean" in {
    val list = List(1, 2, 3, 2, 1)
    assert(isPalindrome(list) == true)

    val list2 = List(1, 1, 2, 2 ,3)
    assert(isPalindrome(list2) == false)

    val list3 = List("a", "b", "c", "c", "b", "a")
    assert(isPalindrome(list3) == true)
  }

  "P07: flatten(List)" should "return a flatten list" in {
    val list = List(List(1, 1), 2, List(3, List(5, 8)))
    flatten(list) should be (List(1, 1, 2, 3, 5, 8))
  }

  "P08: compress(List)" should "eliminate consecutive duplicates" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    compress(list) should be (List('a, 'b, 'c, 'a, 'd, 'e))
  }

  "P09: pack(List)" should "pack duplicates of list elements into sublists" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    pack(list) should be (List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), 
      List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

}
