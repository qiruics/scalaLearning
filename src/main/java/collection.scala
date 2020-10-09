import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object collection {
  def main(args: Array[String]): Unit = {

    //scala 自己的collection
    //1.数组
    //Java中泛型是<>  scala中是[]，所以数组用（n）
    // val 约等于 final不可变描述的是val指定的引用的值（值：字面值，地址）


    //val arr01 = Array[Int](1,2,3,4)
    val arr01 = Array(1,2,3,4)
    println(arr01(1))
    arr01(1) = 99
    println(arr01(1))
    //arr01 = Array(1,2,3,3,3) 报错 无法指向新引用
    for (elem <- arr01) {
      println(elem)
    }
    //遍历元素，需要函数接收元素
    arr01.foreach((x:Int)=>{print(s"$x\t")})
    println()

    val arr02 = for(i <- arr01) yield i*2
    println(arr02)

    //2.链表
    val list02 = new ListBuffer[Int]()
    list02.+=(22)
    println("--------------Set-------------")

    val set01: Set[Int] = Set(1,2,3,4,2,1)
    for (elem <- set01) {
      println(elem)
    }
    set01.foreach(println)

    val set02: mutable.Set[Int] = mutable.Set(11,22,33,44,11)
    set02.add(88)

    val set03: Predef.Set[Int] = scala.collection.immutable.Set(33,44,22,11)

    val t22: ((Int) => Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) = ( (a:Int)=>a+8   ,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4)
    val i: Int = t22._1(8)
    println(t22._1)

    val tIter: Iterator[Any] = t22.productIterator
    while(tIter.hasNext){
      println(tIter.next())
    }

    println("--------------map-------------")
    val map01: Map[String, Int] = Map( ("a",33) ,  "b"->22  ,("c",3434),("a",3333)  )
    val keys: Iterable[String] = map01.keys

    //option: none  some
    println(map01.get("a").get)
//    println(map01.get("w").get)

    println(map01.get("a").getOrElse("hello world"))
    println(map01.get("w").getOrElse("hello world"))


    println("--------------艺术-------------")


    val list = List(1,2,3,4,5,6)
    list.foreach(println)
//    val listMap: List[Int] = list.map( (x:Int) => x+10  )
    val listMap: List[Int] = list.map( _ + 10  )
    listMap.foreach(println)
    val listMap02: List[Int] = list.map(  _*10 )
    list.foreach(println)
    listMap02.foreach(println)

    println("--------------艺术-再-升华------------")

    //基于迭代器的原码分析
    val listStr = List(
      "hello world",
      "hello msb",
      "good idea"
    )

    val iter: Iterator[String] = listStr.iterator  //什么是迭代器，为什么会有迭代器模式？  迭代器里不存数据！

    val iterFlatMap= iter.flatMap(  (x:String)=> x.split(" ") )
//    iterFlatMap.foreach((x:String)=>{println(s"iterFlatMap: $x")})

    val iterMapList = iterFlatMap.map( (_,1) )
//    iterMapList.foreach((x)=>{println(s"iterMapList: $x")})

    while(iterMapList.hasNext){
      val tuple: (String, Int) = iterMapList.next()
      println(tuple)
    }
    iterFlatMap.foreach((x:String)=>{println(s"iterFlatMap: $x")})

  }
}
