object Application {
  def main(args: Array[String]): Unit = {
    println("MainStart!!!")

    Syntax.sample

    val point = new Point(20, 21)
    println(point.toString())
    val point2 = new Point(20, 21)
    println(point2.toString())

    println((point + point2).toString())

    Person.printWeight()
  }
}
