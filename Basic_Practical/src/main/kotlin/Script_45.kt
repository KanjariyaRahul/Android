//45. Get a string from user and display it in lower case

fun main() {
    print("Enter Any String : ")
    var str = readLine() ?: ""

    println("String in lower case : ${str.lowercase()}")
}