import java.util.Locale

object Syntax {
  def sample(): Unit = {
    /*
    // ループを試しにやってみた
    for(x <- 1 to 5; y <- 1 until 5 ; z <- 1 to 5 if x != y){
      println("x = " + x + " y = " + y + " z = " + z)
    }
    for(e <- List("A", "B", "C", "D", "E")) println(e)
    for(e <- List("A", "B", "C", "D", "E")) yield {
      println("pre " + e)
    }

    val taro = "Taro"
    val hoge = null
    taro match {
      case "Taro" => println("Male")
      case "Jiro" => println("Male")
      case "Hanako" => println("Female")
    }

    val lst = List("A", "B", "C")
    lst match {
    case List("A", b, c) if b != "B" =>
      println("b = " + b)
      println("c = " + c)
    case _ =>
      println("nothing")
    }

    val lst = List(List("A"), List("B", "C"))
    lst match {
      case List(a@List("A"), x) =>
        println(a)
        println(x)
      case _ => println("nothing")
    }
    */
    val lst = List("A", "B", "C")
    lst match {
      case "A" :: b :: c :: _ =>
        println("b = " + b)
        println("c = " + c)
      case _ =>
        println("nothing")
    }

    // 型によるパターンマッチ
    val obj: AnyRef = "String Literal"
    obj match {
      case v:java.lang.Integer =>
        println("Integer!")
      case v:String =>
        println(v.toUpperCase(Locale.ENGLISH))
    }

    val obj2: Any = List("a")
    obj2 match {
      case v: List[_] => println("List[_]")
    }
  }
}
