//30. Write a program input one integer number. Check whether number is equal to 10 ornot.

fun main() {
    print("Enter a interger number : ")
    var num = readLine()?.toIntOrNull()
    println("---------------------------------")

    if(num == 10){
        println("$num is equal to 10")
    }else{
        println("$num is not equal to 10")
    }
}