//35. Write a program input one integer number display appropriate name of month

fun main() {

    print("Enter a number 1-12 to display the appropriate month name : ")
    val Number = readLine()?.toIntOrNull()

    val month = when (Number) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> {
            print("Invalid input. Please enter a number between 1 and 12.")
            return
        }
    }

    println("Month name is: $month")
}
