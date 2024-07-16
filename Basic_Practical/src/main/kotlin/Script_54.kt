//54. Print 1 2 3 5 6 7 9 -_ _ _ n

fun main() {
    val n = 10
    for (i in 1..n) {
        if (i != 4 && i != 8) {
            print("$i ")
        }
    }
}
