
 open class Person (name : String){
    init{
        println("My name is : $name")
    }

    fun MyAadhar(no : Long){
        println("My Aadhar is $no")
    }
}

class  Teacher(name : String , cName : String) : Person("MCA"){
    init{
        println("My name is : $name And College name is $cName")
    }
}

fun main() {
    var per1 = Person("Atmiya")
    per1.MyAadhar(123456879010)
    var rahul = Teacher("Rahul" , "Atmiya")
    rahul.MyAadhar(123456879111)
}