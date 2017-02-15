object FibonacciTailRec {
  def main(args: Array[String]) : Unit = {
    (0 to 8).toList.map(fib).map(println)
  }

  def fib(n: Int) : Int = {
    @annotation.tailrec
    def go(n: Int, prev: Int, curr: Int) : Int =
      if ( n < 0 || n == 0)   prev
      else if ( n == 1 )      curr
      else                    go(n - 1, curr, prev + curr)

    go(n, 0, 1)
  }
}