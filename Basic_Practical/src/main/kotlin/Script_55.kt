//55. Input and number display table of that number

fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        println("Multiplication table of $number:")
        for (i in 1..10) {
            println("$number x $i = ${number * i}")
        }
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

