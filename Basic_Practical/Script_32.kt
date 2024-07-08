//32. Write a program input one integer number check whether number is four digits or not

fun main() {
    print("Enter a integer number :")
    var num = readLine()?.toIntOrNull()

    if (num != null && num in 1000 .. 9999) {
        println("The number $num is a four-digit number.")
    }else{
        println("The number $num is not a four-digit number.")
    }
}