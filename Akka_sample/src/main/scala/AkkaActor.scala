import akka.actor.{ Actor, ActorSystem, Props }
import scala.io.StdIn

class SampleActor extends Actor {
  override def receive: Receive = {
    case msg => println(msg)
  }
}

object ActorMain extends App {
  val system = ActorSystem("System")
  val ref = system.actorOf(Props[SampleActor])

  ref ! "HelloWorld!!"
//  try StdIn.readLine()

//  finally system.terminate()
}