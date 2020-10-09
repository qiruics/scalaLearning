object test {

  // main class object
  //文件名只是载体 可以不同
  //obejct = 单例 = static 静态代码块 优先执行
  //单例 默认构造方法
  private val tt:test = new test("woman")
  private val name = "object:xinzhancs"
  println("test1")
  def main(args: Array[String]): Unit = {
    println("hello world")
    //伴生关系
    tt.printMsg()
  }
  println("test2")
}
//类名构造器中的参数就是类的成员属性，且默认是val类型，且默认是private
class test(sex:String){

  var name = "class:xinzhancs" //final part
//  val gender = "man"

  //个性化构造
  def this(xname: Int){
    //必须调用默认构造
    this("man")
//    gender = xgender
  }

  def printMsg(): Unit ={
    //${test.name} 指代object的name 相当于 静态属性
    println(s"hello from msg ${test.name} ${this.name} $this.sex")
  }
}