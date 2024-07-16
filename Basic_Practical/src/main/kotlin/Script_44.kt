//44. Get a string from user and display it in upper case

fun main() {
    print("Enter Any String : ")
    var str= readLine() ?: ""

    println("Stirng in UPPER CASE : ${str.uppercase()}")
}