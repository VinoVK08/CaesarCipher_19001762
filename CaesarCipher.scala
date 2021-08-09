//19001762
import scala.io.StdIn._

object CaesarCipher {
def main(args: Array[String]) {
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

   val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);
   val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size);
   val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(ch=> if(ch==' ') ch else algo(ch,key,a))




println("Select the number of operation : ")
println("1. encrypt: ")
println("2. decrypt: ")
var option = scala.io.StdIn.readInt()

if (option==1){
  val t = scala.io.StdIn.readLine("Enter the text: ")
  println("Enter the number of shifts: ")
  var s = scala.io.StdIn.readInt()
  println(cipher(E,t,s,alphabet))
}else if(option==2){
  val t = scala.io.StdIn.readLine("Enter the text: ")
  println("Enter the number of shifts: ")
  var s = scala.io.StdIn.readInt()
  println(cipher(D,t,s,alphabet))
}else{
  println("invalid option")
}
}
}

