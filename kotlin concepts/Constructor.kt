 data class emp constructor(var Eno : Int , var Ename : String, var Esalary : Long){
    constructor():this(101, "rahul", 500000){
        println("Constructor 1 -> " + "$Ename")
    }
    constructor(Eno: Int , Ename: String):this(){
        this.Eno = Eno
        this.Ename = Ename
        println("Constructor 2 -> " + "$Ename" )
    }
}

fun main() {
    var emp1 = emp()
    println(emp1.Esalary)
    var emp2 = emp(501 , "jay")
    println(emp2.Eno)
    var emp3 = emp( 501 , "jay")
    println(emp2 == emp3)


}