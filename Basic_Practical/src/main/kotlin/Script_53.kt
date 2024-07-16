//53. Print 1 10 2 9 3 8 4 7 5 6

fun main() {
    val n = 10
    for (i in 1..n/2) {
        print("$i ")
        print("${n - i + 1} ")
    }
}
