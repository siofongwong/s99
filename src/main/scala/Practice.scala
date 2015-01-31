object Practice {

    // P01
    def last(list: List[Any]): Any = list match {
        case a :: Nil => a
        case a :: b => last(b)
        case _ => Unit
    }

    // P02
    def penultimate(list: List[Any]): Any = list match {
        case a :: List(b) => a
        case a :: b => penultimate(b)
    }

    // P03
    def nth(n: Int, list: List[Any]): Any = list match {
        case a :: b => if (n == 0) a else nth(n - 1, b)
        case _ => Unit
    }

    // P04
    def length(list: List[Any]): Any = {

        def length_helper(n: Int, list: List[Any]): Any = list match {
            case a :: Nil => n
            case a :: b => length_helper(n + 1, b)
        }

        list match {
            case a :: b => length_helper(1, b)
            case _ => 0
        }
    }

    // P05
    def reverse(list: List[Any]): Any = Unit
}

