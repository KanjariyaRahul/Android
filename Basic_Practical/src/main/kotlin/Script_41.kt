//41. Write a program to find number which number is divisible by 3 but not divisible by 7

fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (number % 3 == 0 && number % 7 != 0) {
        println("$number is divisible by 3 but not by 7.")
    } else {
        println("$number is not divisible by 3 or it is divisible by 7.")
    }
}
