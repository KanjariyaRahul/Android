//27. Write a program that accepts the year from user and check it leap year or not.

fun main() {

    print("Enter the year : ")
    val year = readLine()!!.toInt()
    println("------------------------------------")

    if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
        println("$year is leap year")
    }else{
        println("$year is not leap year")
    }
}