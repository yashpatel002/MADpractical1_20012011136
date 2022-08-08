fun main(){
    print("Enter Number : ")
    var x = readLine() !!.toInt()
    println(if(x%2 == 0)
        "$x is EVEN"
    else
        "$x is ODD")
}