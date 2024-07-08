//26. Write a program to check number is odd or even

fun main() {

    print("Enter the Number : ")
    var num = readLine()!!.toInt()

    if(num % 2 == 0){
        println("$num is an even number")
    }else{
        println("$num is an odd number")
    }
}