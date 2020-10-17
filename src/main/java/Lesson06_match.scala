


object Lesson06_match {

  def main(args: Array[String]): Unit = {
    val tup = (1.0, 88, "abc", false, 99)

    val iter = tup.productIterator
    val res = iter.map((x) => {x match {
      case 1 => println(s"$x...is 1")
      case 88 => println(s"$x ...is 88")
      case false => println(s"$x...is false")
      case w: Int if w > 50 => println(s"$w...is  > 50")
      case _ => println("nothing")
    }})

    while(res.hasNext){
      println(res.next())
    }

  }

}
