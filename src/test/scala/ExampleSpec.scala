import org.scalatest._
import Practice._

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

}
