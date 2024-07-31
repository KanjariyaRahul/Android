import org.jetbrains.annotations.NotNull

fun main()
{
    var neverNUll : String  = "This can't be Null"
    //neverNull = null

    var nullable : String ? = " You can keep null here"
    nullable = null

    var interredNonNull = "The compiler Assums Not null "
    //interredNonNull= null

    println(strLength(neverNUll))
    println(strLength(nullable))

}

fun strLength(notNull: String?) : Int ? {
    return notNull?.length

}