object Currying {
  def main(args: Array[String]): Unit = {
    val greet = (g: String, n: String) => g + " querido " + n + "\n"
    println("Basic greet")
    println(greet("hola", "erick"))

    val curriedGreet = curry(greet)

    val sayHi = curriedGreet("Hi")
    println("Curried greet")
    println(sayHi("Erick"))

    val uncurried = uncurry(curriedGreet)

    println("Uncurried greet")
    println(uncurried("Hello", "Erick!"))

    val addSepulveda = (n: String) => n + " Sepulveda"
    val sayHiSepulveda = compose(sayHi, addSepulveda)

    println(sayHiSepulveda("Erick"))
  }

  def curry[A,B,C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  def uncurry[A,B,C](f: A => B => C): (A, B) => C =
    (a: A, b: B) => f(a)(b)

  def compose[A,B,C](f: B => C, g: A => B): A => C =
    (a: A) => f(g(a))
}