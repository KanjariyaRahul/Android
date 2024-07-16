//34. Write a program input one integer number display appropriate day of week.

fun main() {
    print("Enter a number between 1 and 7 :")
    val num = readLine()?.toIntOrNull()

    val dayOfWeek = when (num) {
        1 ->"Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> {
            print("Invalid day number. Please enter a number between 1 and 7.")
            return
        }
    }
    println("Day of the week is $dayOfWeek")
}