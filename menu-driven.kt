fun main() {
    var choice: Int
    do {
        println("-----------------------------")
        println("Enter 1 for Addition")
        println("Enter 2 for Subtraction")
        println("Enter 3 for Multiplication")
        println("Enter 4 for Division")
        println("Enter 5 for Exit")
        println("-----------------------------")
        print("Enter your Choice : ")
        choice = readLine()!!.toIntOrNull()!!

            when (choice) {
                1 -> {

                    println("You Selected Addition")
                    println("------------------------------")
                    print("Enter First Number: ")
                    val num1 = readLine()?.toDoubleOrNull()!!
                    print("Enter Second Number: ")
                    val num2 = readLine()?.toDoubleOrNull()!!
                    println("-----------------------------")
                    println("Addition = ${num1 + num2}")
                }

                2 -> {

                    println("You Selected Subtraction")
                    println("------------------------------")
                    print("Enter First Number: ")
                    val num1 = readLine()?.toDoubleOrNull()!!
                    print("Enter Second Number: ")
                    val num2 = readLine()?.toDoubleOrNull()!!
                    println("-----------------------------")
                    println("Subtraction = ${num1 - num2}")
                }

                3 -> {

                    println("You Selected Multiplication")
                    println("------------------------------")
                    print("Enter First Number: ")
                    val num1 = readLine()?.toDoubleOrNull()!!
                    print("Enter Second Number: ")
                    val num2 = readLine()?.toDoubleOrNull()!!
                    println("-----------------------------")
                    println("Multiplication = ${num1 * num2}")
                }

                4 -> {
                    println("You Selected Division")
                    println("------------------------------")
                    print("Enter First Number: ")
                    val num1 = readLine()?.toDoubleOrNull()!!
                    print("Enter Second Number: ")
                    val num2 = readLine()?.toDoubleOrNull()!!
                    println("-----------------------------")
                    if (num2 != 0.0) {
                        println("Division = ${num1 / num2}")
                    } else {
                        println("Error: Division by zero is not allowed.")
                    }
                }
                5 -> {
                    println("----------------------------")
                    println("Exiting program. Goodbye!")
                }
                else -> {
                    println("Invalid Choice. Please try again.")
                }
            }
    } while (choice != 5)
}
