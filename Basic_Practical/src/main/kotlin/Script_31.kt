//31. Write a program input one integer number check whether number is in between 0 to100 or
//not

fun main() {

    print("Enter a number : ")
    val num = readLine()?.toIntOrNull()

    if(num != null && num in 0 .. 100)
    {
        print("The number $num is between 0 and 100.")
    }else
    {
        println("The number  $num is not between 0 and 100.")
    }
}