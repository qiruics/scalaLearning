import java.util.Date

object function {
  def main(args: Array[String]): Unit = {
    println("-------1.basic----------")

    //返回值，参数，函数体
    def fun01() {
      println("hello world")
    }

//    var y = fun01()
    val funa = fun01()
    println(funa)
    val func = fun01 _
    func()
    var x = 3

    def fun02(): Int ={
      3
    }
    val a= 1
    def fun03(a: Int): Int = {
      a+1
    }
    val function3 = fun03(4)
    println(s"function3 + $function3")
    def fun04(a:Int):Int= {
      if (a == 1) {
        a
      } else {
      a * fun04(a-1)
      }
    }
    println(fun04(4))

    //匿名函数
    var yy : (Int, Int) => Int = (a: Int, b: Int) => {
      a + b
    }
    val w = yy(3, 4)
    println(w)

    println("--------5.嵌套函数---------")

    def fun06(a: String): Unit = {

      def fun05(): Unit = {
        println(a)
      }

      fun05()
    }

    fun06("hello")

    println("--------6.偏应用函数---------")

    def fun07(date:Date, tp:String, msg:String): Unit ={
      println(s"$date\t$tp\t$msg")
    }

    fun07(new Date(), "info", "ok")

    var info = fun07(_:Date, "info",_:String)
    info(new Date(), "error")


    println("--------7.可变参数---------")

    def fun08(a: Int*): Unit = {
//      for (e <- a) {
//        println(e)
//      }
      //      def foreach[U](f: A => U): Unit
      //      a.foreach(   (x:Int)=>{println(x)}   )
      //      a.foreach(   println(_)   )
//      a.foreach(println)
      a.foreach((x:Int) => {println(x+2)})
    }
    fun08(2)
    fun08(1,2,3,4,5,6)

    println("--------8.高阶函数---------")
    //函数作为参数，函数作为返回值
    //函数作为参数
    def computer(a: Int, b: Int, f: (Int, Int) => Int): Unit = {
      val res: Int = f(a, b)
      println(res)
    }
    computer(3, 8, (x: Int, y: Int) => {
      x + y
    })
    computer(3, 8, (x: Int, y: Int) => {
      x * y
    })
    computer(3, 8, _ * _)

    //函数作为返回值：
    def factory(i: String): (Int, Int) => Int = {
      if (i.equals("+")) {
        (x:Int, y:Int) =>{
          x + y
        }
      } else if(i.equals("*")) {
        (x: Int, y: Int) => {
          x * y
        }
      }else if(i.equals("-")){
        (x:Int, y:Int) => {x - y}
      }else{
        (x:Int, y:Int) => {x / y}
      }
    }
    computer(3, 8, factory("-"))

    println("--------9.柯里化---------")

  }
}
