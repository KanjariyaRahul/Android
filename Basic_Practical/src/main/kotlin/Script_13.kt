//13. Write a program to swap two values

fun main() {
    var num1 = 10
    var num2 = 20

    println("-------- Before Swaping --------")
    println("value of Number1 is : $num1")
    println("value of Number2 is : $num2")

    var temp = num1
    num1 = num2
    num2 = temp

    println("-------- After Swaping --------")
    println("value of Number1 is : $num1")
    println("value of Number2 is : $num2")
}