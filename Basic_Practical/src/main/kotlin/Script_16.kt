//16. Write a program to read the value of X and Y and print the result of following
//expression (X+Y)/2

fun main() {

    print("Enter the value of X : ")
    var x = readLine()?.toDoubleOrNull()

    print("Enter the value of Y : ")
    var y = readLine()?.toDoubleOrNull()

    if(x != null && y != null) {
        var result = (x + y ) / 2
        println("result of (x + y)/2  = $result")

    }else{
        println("Please enter the value of X to Y ")
    }
}