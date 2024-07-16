//60. Print factorial value of given number

fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number >= 0) {
        var factorial = 1
        for (i in 1..number) {
            factorial *= i
        }
        println("Factorial of $number is: $factorial")
    } else {
        println("Invalid input. Please enter a non-negative integer.")
    }
}
