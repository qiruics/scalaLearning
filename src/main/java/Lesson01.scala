import scala.collection.immutable

object Lesson01 {
  def main(args: Array[String]): Unit = {
    //流控
    var a = 3
    //if else
    if(a<0){
      println(s"$a<0")
    }else if(a == 0){
      println(s"$a==0")
    }else{
      println(s"$a>0")
    }
    //while
//    while(a < 10){
//      a += 1
//      println(a)
//    }
    //for 只支持
//    val seqs: Range.Inclusive = 1 to (10,2)
//    println(seqs)

    val seqs = 1 until 10
    println(seqs)

//    for( i <- seqs){
//      for(j <- seqs if(j<=i)){
//        print(s"$i*$j = ${i*j}\t")
//        if(j==i) println()
//      }
//    }

    for(i <- seqs;j <- seqs if( j<=i ) ){
      print(s"$i * $j = ${i*j}\t")
      if(j==i) println()
    }
    val seqss: immutable.IndexedSeq[Int]= for(i <- 1 to 10) yield {
      var x = 8
      i + x
    }
    print(seqss)
  }

}
