object Application {
  def main(args: Array[String]): Unit = {
    println("MainStart!!!")
    SingletonObject.print()
    val instance = new ClassObject
    instance.print()

    println(Operation.plus(1,1))
    println(Operation.minus(1,1))

    println(Operation.addTwo(4))
  }
}
