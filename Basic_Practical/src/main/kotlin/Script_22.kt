//22. Write a program to find out the net salary of an employee and get the basic salary from him.
//Applicable TA 4%, DA 30%, HRA 15% on basic salary. Applicable 3% tax 12% PF on basic salary

fun main() {

    print("Enter the basic salary:")
    var basicSalary = readLine()!!.toDouble()
    println("---------------------------")

    var ta =   basicSalary *  0.04
    var da = basicSalary * 0.30
    var hra = basicSalary * 0.15


    var grossSalary =   basicSalary + ta + da + hra

    var tax = basicSalary * 0.03
    var pf = basicSalary * 0.12


    var netsalary = grossSalary - tax - pf

    println("Basic Salary: $basicSalary")
    println("Travel Allowance (TA): $ta")
    println("Dearness Allowance (DA): $da")
    println("House Rent Allowance (HRA): $hra")
    println("Gross Salary: $grossSalary")
    println("Tax: $tax")
    println("Provident Fund (PF): $pf")
    println("Net Salary: $netsalary")
}