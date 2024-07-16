//21. Write a program that accept 5 numbers from user and find average of the value

fun main() {
//    print("Enter the num1 value : ")
//    var num1 = readLine()!!.toInt()
//    print("Enter the num2 value : ")
//    var num2 = readLine()!!.toInt()
//    print("Enter the num3 value : ")
//    var num3 = readLine()!!.toInt()
//    print("Enter the num4 value : ")
//    var num4 = readLine()!!.toInt()
//    print("Enter the num5 value : ")
//    var num5 = readLine()!!.toInt()
var sum=0.0
    println("Enter 5 numbers:")
    for (i in 0 .. 4) {
        print("Enter number ${i + 1}: ")
        val num = readLine()?.toDoubleOrNull()!!
        sum += num
    }
    val average = sum / 5

    println("------------------------------")
    print("average of five numbers is  = $average")
}