fun main() {
    print("Enter the sales bill amount: ")
    val billAmount = readLine()!!.toDouble()

    if (billAmount < 5000) {

        val discount = billAmount * 7.5 / 100
        val netPayable = billAmount - discount
        println("Bill Amount: $billAmount")
        println("A discount of 7.5% has been applied.")
        println("Discount Amount: $discount")
        println("Net Payable Bill: $netPayable")

    } else {
        val discount = billAmount * 11.0 / 100
        val netPayable = billAmount - discount
        println("Bill Amount: $billAmount")
        println("A discount of 11% has been applied.")
        println("Discount Amount: $discount")
        println("Net Payable Bill: $netPayable")
    }


}
