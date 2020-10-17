trait God{
  def cry():Unit={
    println(s"god ... say")
  }
}

trait Mg{
  def des():Unit={
    println(s"mg ... say")
  }
}

class AKA extends God with Mg {
  def hehe():Unit={
    println(s"AKA ... say")
  }
}

class AKB {
  def hehe():Unit={
    println(s"AKB ... say")
  }
}

class Person(name:String) extends AKA{
  def hello():Unit ={
    println(s"$name say hello")
  }
}

object Lesson04_trait {
  def main(args: Array[String]): Unit = {
    val p:Person = new Person(name = "zhangsan")
    p.hehe()
    p.cry()
    //class AKA inherits conflicting members:
    //  method cry in trait God of type ()Unit  and
    //  method cry in trait Mg of type ()Unit
    //(Note: this can be resolved by declaring an override in class AKA.)
    //class AKA extends God with Mg {
  }
}
