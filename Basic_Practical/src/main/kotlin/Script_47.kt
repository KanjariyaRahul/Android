//47. Write a program that accept character from keyboard and determine whether the
//character is a capital letter, small letter, digit or a special character

fun main() {
    print("Enter a character: ")
    val input = readLine()

    if (input != null && input.isNotEmpty()) {
        val char = input.single()

        if (char in 'A'..'Z') {
            println("$char is a capital letter")
        } else if (char in 'a'.. 'z') {
            println("$char is a small letter")
        } else if (char in '0'..'9') {
            println("$char is a digit")
        } else {
            println("$char is a special character")
        }
    } else {
        println("Please enter a valid character.")
    }
}
