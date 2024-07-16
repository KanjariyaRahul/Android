//14. Write a program to swap two values without using third variable

//13. Write a program to swap two values

fun main() {
    var num1 = 10
    var num2 = 20

    println("-------- Before Swaping --------")
    println("value of Number1 is : $num1")
    println("value of Number2 is : $num2")

    num1 = num1 + num2
    num2 = num1 - num2
    num1 = num1 - num2


    println("-------- After Swaping --------")
    println("value of Number1 is : $num1")
    println("value of Number2 is : $num2")
}