class Point(val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }
  override def toString(): String = "(" + x + ", " + y + ")"
}

class Person(name: String, age: Int, private val weight: Int)

// コンパニオンオブジェクト
object Person {
  def printWeight(): Unit = {
    val taro = new Person("Taro", 20, 70)
    println(taro.weight)
  }
}

class SampleClassA(val name: String) extends TraitSampleA

object SampleObjectA {
  def echo (): Unit = {
    val a = new SampleClassA("hoge")
    a.printName()
    val a2 = new TraitSampleA { val name = "fuga" }
    a2.printName()
  }
}

class TraitMultiClassA extends TraitA with TraitB with TraitC {
  def greetA(): Unit = super[TraitA].greet()
  def greetB(): Unit = super[TraitB].greet()
  def greetC(): Unit = super[TraitB].greet()
}