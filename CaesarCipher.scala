//19001762
import scala.io.StdIn._

object CaesarCipher extends App{
def cipher(t:String,s:Int):String= {
  var result = "";
  var i = 0;
  for(i <-0 until t.length()){
    if((t.charAt(i).isUpper)){
      var ch = ((t.charAt(i).toInt + s - 65) % 26 + 65).toChar;
      var str = ch.toString;
      result = result.concat(str);
    }else if(t.charAt(i)==' '){
        var str = t.charAt(i).toString;
        result = result.concat(str);
    }else{
      var ch = ((t.charAt(i).toInt + s - 97) % 26 + 97).toChar;
      var str = ch.toString;
      result = result.concat(str);
    }

  }
  return result;
}

println("Select the number of operation : ")
println("1. encrypt: ")
println("2. decrypt: ")
var option = scala.io.StdIn.readInt()

val t = scala.io.StdIn.readLine("Enter the text: ")
println("Enter the number of shifts: ")
var s = scala.io.StdIn.readInt()
if (option==1){
  println(cipher(t,s))
}else if(option==2){
  println(cipher(t,26-s))
}else{
  println("invalid option")
}
}
