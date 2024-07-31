 open class  A (){
    constructor(no : Int) :this(){
        println("A Constructor  : $no")
    }
     init {
         println("A init")
     }
}

class B :A {
     constructor (no : Int , name : String) : super(50){
         println("B Constructor  : $no && $name")
     }
    init {
        println("B init")
    }
}


fun main() {
   var b =  B(20 , "rahul")
}