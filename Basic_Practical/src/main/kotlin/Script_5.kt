//5. Write a program to calculate compound interest

fun main() {
    print("Enter the principal amount: ")
    val principal = readLine()!!.toDouble()

    print("Enter the rate of interest: ")
    val rate = readLine()!!.toDouble()


    print("Enter the time period in years: ")
    val time = readLine()!!.toDouble()

    print("Enter the number of times interest is compounded per year: ")
    val n = readLine()!!.toDouble()

    var CompoundInterest = principal * Math.pow((1 + rate / (n * 100)), n * time)

    println("--------------------------")
    println("Simple Compound Interest is : $CompoundInterest")

}