//57. Print series of 1/2, 2/3, 3/4, 4/5, _ _ _ N/N+1

fun main() {
    print("Enter a number N: ")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        println("Series of fractions 1/2, 2/3, 3/4, ..., $n/${n+1}:")
        for (i in 1..n) {
            println("$i/${i+1}")
        }
    } else {
        println("Invalid input. Please enter a valid positive integer.")
    }
}
