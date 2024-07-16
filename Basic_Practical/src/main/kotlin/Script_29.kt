//29. Write a program that accept the number from user and check its negative, positive or zero

fun main() {

    print("Enter a number : ")
    val num = readLine()!!.toDouble()
    println("--------------------------------")

    if (num > 0){
        println("$num  is positive")
    }else if (num < 0)
    {
        println("$num is negative ")
    }else
    {
        println("$num is Zero ")
    }

}