import fpinscala.datastructures.List
import fpinscala.datastructures.List.{tail, setHead, drop, dropWhile, init}

object TestList {
  def main(args: Array[String]): Unit = {
    val a = List(1,2,3,4,5)

    println(setHead(a, 7))              // 7, 2, 3, 4, 5
    println(tail(a))                    // 2, 3, 4, 5
    println(drop(a, 2))                 // 3, 4, 5

    val lessThan4 = (x: Int) => x < 4
    println(dropWhile(a, lessThan4))    // 4, 5

    println(init(a))
  }
}