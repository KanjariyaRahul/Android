//28. Write a program to that accept the number from user and check it is divisible by 5 or not.

fun main() {
    print("Enter a Number : ")
    var num = readLine()!!.toDouble()


    if(num % 5 == 0.0){
        print("$num is divisible by 5")
    }else{
        print("$num is not divisible by 5")
    }
}