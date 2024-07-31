fun printmsg(msg : String)
{
    print("$msg")
}

fun printmsgPrefix(number : Int, msg : String , prefix : String ="info")
{
    println(" Number = $number , Prefix = $prefix || Name = $msg ")
}

fun sum(a : Int , b : Int ) : Int {
    return a + b
}

fun main() {
    printmsg("Hello Rahul")
    println()
    printmsgPrefix(20,"Rahul")
    println()
    printmsgPrefix(msg="Rahul", number = 50)
    println()
    printmsgPrefix(100, "Rahul", "Kanjariya")
    println()
    printmsgPrefix(prefix = "kanjariya" , msg = "rahul" , number = 500)
    println()
    print(sum(10,20))
}