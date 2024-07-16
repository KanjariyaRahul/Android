//43. An electric power distribution company charger its domestic customers as follows
//Consumption unit rate of charge
//
//0 – 200 RS. 0.50 per unit
//201 – 400 RS. 100 + RS. 0.65 per unit
//401 – 600 RS. 230 + RS. 0.80 per unit
//601 and above RS. 390 + RS. 1.00 per unit
//Read the customer number and power consumed and print the amount to be paid by the customer

fun main() {
    print("Enter Customer Number : ")
    var cnum = readLine()?.toDoubleOrNull()
    print("Enter power consumed (units): ")
    var unit = readLine()?.toDoubleOrNull()

    var amount : Double = 0.0
    if(cnum != null && unit !=null)
    {
        if(unit<=200){
            amount = unit*0.50
        }
        else if(unit<=400){
            amount = (unit*0.65)+100
        }
        else if(unit<=600){
            amount = (unit*0.80)+230
        }
        else{
            amount = (unit*1)+390
        }
    }
    println("---------------BILL---------------")
    println("Customer Number : $cnum")
    println("Power Consumed in Units : $unit")
    println("Payble Amount : $amount")
    println("----------------------------------")
}