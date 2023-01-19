object hello {
  def main(args: Array[String]) = {
    println("Hello, World!")
    println("-" * 20)
    valuePractice("placeholder")
    println("-" * 20)
    stringInterpolation("John", "Doe")
    println("-" * 20)
    tripleQuotes()
    println("-" * 20)
    controlStructures.main()
  }

  def valuePractice(args: String) = {
    val a = 0 // this is immutable
    var b = 1 // this is mutable

    println(b) // should output 1

    b = 2

    println(b) // should output 2
  }

  def stringInterpolation(firstName: String, lastName: String) = {
    println(s"Name: $firstName $lastName")
  }

  def tripleQuotes() = {
    val quote = """
      This is a multiline string
      using triple quotes
    """
    println(quote)
  }

}

object controlStructures {
  def main() = {
    ifElse()
    forLoops()
    println("-" * 20)
    guardedForLoops()
  }

  def ifElse() = {
    val x = if (1 > 0) 69 else 1
    val testPasses = x == 69
    assert(testPasses)
  }

  def forLoops() = {
    val ints = List(1, 2, 3, 4, 5)
    for (i <- ints)
      println(i)
  }

  def guardedForLoops() = {
    for (i <- 0 to 9 if i % 3 == 0)
      println(i) // print factors of 3 only
  }
}
