//37. Write a program to find out minimum from three number

fun main() {

    print("Enter the first number : ")
    var num1 = readLine()?.toIntOrNull()

    print("Enter the second number : ")
    var num2 = readLine()?.toIntOrNull()

    print("Enter the third number : ")
    var num3 = readLine()?.toIntOrNull()

    println("----------------------------------------")

    if (num1!=null && num2!=null && num3!=null){

        if(num1<=num2&&num1<=num3){
            print("The minimum number is : $num1")
        }else if(num2<=num3&&num2<=num1){
            print("The minimum number is : $num2")
        }else{
            print("The minimum number is : $num3")
        }
    }
}