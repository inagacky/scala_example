trait TraitSampleA {
  val name: String
  def printName(): Unit = println(name)
}

trait TraitA {
  def greet(): Unit = println("TraitA")
}

trait TraitB extends TraitA {
  override def greet(): Unit = println("TraitB")
}

trait TraitC extends TraitA {
  override def greet(): Unit = println("TraitC")
}

