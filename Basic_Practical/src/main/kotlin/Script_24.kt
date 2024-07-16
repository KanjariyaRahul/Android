//24. Write a program to find out minimum number from 2 numbers

fun main() {

    var num1 = 10
    var num2 = 15

    var MinNumber = 0

    if(num1 < num2){
        MinNumber = num1
    }else{
        MinNumber = num2
    }
    println("The Minimum number between $num1 and $num2  is : $MinNumber")
}