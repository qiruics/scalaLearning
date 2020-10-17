import java.util
object Lesson08_implicit {

  def main(args: Array[String]): Unit = {
    val list = new util.LinkedList[Int]()
    list.add(1)
    list.add(2)
    list.add(3)

//    foreach(list,println)

//    def foreach[T](list:util.LinkedList[T],f:(T) => Unit):Unit={
//      val iter: util.Iterator[T] = list.iterator()
//      while(iter.hasNext) f(iter.next())
//    }

//    val xx = new xxx[Int](list)
//    xx.foreach(println)

    implicit def sdfsdf[T](list:util.LinkedList[T]) ={
      new xxx(list)
    }
    list.foreach(println)
  }
}
class xxx[T](list:util.LinkedList[T]){
  def foreach(f:(T) => Unit):Unit={
    val iter: util.Iterator[T] = list.iterator()
    while(iter.hasNext) f(iter.next())
  }
}
