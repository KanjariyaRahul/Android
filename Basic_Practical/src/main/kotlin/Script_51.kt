//51. Print 1 2 4 8 16 32 64 128 256 512 1024

fun main() {
    var num = 1
    for(i in 1..11) {
        print("$num ")
        num *= 2
    }
}