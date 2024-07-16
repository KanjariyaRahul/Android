//15. Write a program to read the value of X and Y and print the result of following expression
//(X+Y)/(X-Y)

fun main() {
//    var x= 20
//    var y= 10

    print("Enter the value of X: ")
    val x = readLine()?.toDoubleOrNull()

    print("Enter the value of Y: ")
    val y = readLine()?.toDoubleOrNull()

    if (x!= null && y!= null && x - y != 0.0) {
        var result = (x + y) / (x - y)
        println("Result of (X + Y) / (X - Y) = $result")
    }else
    {
        println("Invalid input or division by zero. Please enter valid non-zero values for X and Y.")
    }

}