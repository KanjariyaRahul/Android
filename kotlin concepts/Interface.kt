interface  myInterface{
    val test : Int
    fun foo() : String
    val name : String
    fun hello()
    {
        println("Hello All")
    }
}

class  interfaceImp : myInterface{
    override val name = "rahul"
    override val test =  100
    override fun foo() = "Mca"
}

fun main() {
    var obj = interfaceImp()
    println("test = ${obj.test}")
    println("Name is : ${obj.name}")
    println(obj.foo())
    obj.hello()
}