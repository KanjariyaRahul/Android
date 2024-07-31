fun main()
{
    val pi : Float = 3.14f

    print("Enter A Value Of Raduis :")
    val r : String? = readLine()!!.toString()

    if(r!!.toFloatOrNull() == null)
    {
        println("Invalid Input")
    }
    else
    {
        val rad = r.toFloat()
        println("Area OF Circel : ${pi * rad * rad}")
    }

}