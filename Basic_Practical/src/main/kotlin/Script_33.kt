//33. Write a program input one integer number check whether is greater than 50 and lessthen
//200

fun main() {
    print("Enter a number : ")
    var num = readLine()?.toIntOrNull()

    if(num != null && num > 50 && num < 200){
        println("The number $num is greater than 50 and less than 200.")
    }else {
        println("The number is not within the range (greater than 50 and less than 200).")
    }
}