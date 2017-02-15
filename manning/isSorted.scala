object isSorted {
  def main(args: Array[String]) : Unit = {
    println(isSorted(Array(1,2,3,4,5), lessThan))
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean) : Boolean = {
    as.iterator.sliding(2).toArray.foldLeft(true)((z, i) => z && ordered(i(0), i(1)))
  }

  def lessThan(a: Int, b: Int) : Boolean = a < b
}