fun main()
{
    for(i in 1..10) //Simple 1 To 10 Print
    {
        print("$i ")
    }

    println()
    for(i in 1..10 step 2) // Odd Number
    {
        print("$i ")
    }

    println()
    for(i in 2..10 step 2) // Even Number
    {
        print("$i ")
    }

    println()
    for(i in 10 downTo  1 ) // Reverse Number
    {
        print("$i ")
    }

    println()
    for(i in 20 downTo 1 step 2) // Odd Number
    {
        print("$i ")
    }

}