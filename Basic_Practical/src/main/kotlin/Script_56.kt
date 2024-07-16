//56. Print series of 1/1, 1/2, 1/3, _ _ _ 1/N

fun main() {
    print("Enter a number N: ")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        println("Series of fractions 1/1, 1/2, 1/3, ..., 1/$n:")
        for (i in 1..n) {
            println("1/$i")
        }
    } else {
        println("Invalid input. Please enter a valid positive integer.")
    }
}
