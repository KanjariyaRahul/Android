//39. Write a program input integer number and select number to perform following task
//
//1 – Addition
//2 – Subtraction
//3 – Multiplication
//4 – Division
//5 – Exit

fun main() {
    var choice: Int
    var result: Double

    do {
        println("1 - Addition")
        println("2 - Subtraction")
        println("3 - Multiplication")
        println("4 - Division")
        println("5 - Exit")

        print("Enter your choice : ")
        choice = readLine()!!.toInt()
        println("------------------------------")

        if (choice in 1..4) {
            print("Enter first number : ")
            var num1 = readLine()?.toDoubleOrNull()

            print("Enter second number : ")
            var num2 = readLine()?.toDoubleOrNull()
            println("-------------------------------")

            if(num1!=null && num2!=null) {
                when (choice) {
                    1 -> {
                        result = (num1 + num2)
                        println(" Addition is: $result")
                    }

                    2 -> {
                        result = (num1 - num2)
                        println(" Subtraction is  : $result")
                    }

                    3 -> {
                        result = (num1 * num2)
                        println("Multiplication is : $result")
                    }

                    4 -> {
                        if (num2 != 0.0) {
                            result = (num1 / num2)
                            println("Division is : $result")
                        } else {
                            println("Error: Division by zero")
                        }
                    }
                }
            }
        } else if (choice == 5) {
            println("Exiting program.")
        } else {
            println("Invalid choice. Please enter a number between 1 and 5.")
        }

        println()
    } while (choice != 5)
}
