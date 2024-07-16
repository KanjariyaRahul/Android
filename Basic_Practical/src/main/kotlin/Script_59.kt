//59. Print 0 1 1 2 3 5 8 13 21 34 55 (Fibonacci)

fun main() {
    val n = 11
    print("Fibonacci Series up to $n terms: ")
    var a = 0
    var b = 1

    for (i in 1..n) {
        print("$a ")
        val sum = a + b
        a = b
        b = sum
    }
}

