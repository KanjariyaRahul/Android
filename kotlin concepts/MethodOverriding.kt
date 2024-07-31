open class Shiva{
     open fun prayer(){
        println("Shiva's prayer")
    }
}

class Rama : Shiva(){
    override fun prayer(){
        println("Rama's rama")
    }
}

class Krishna : Shiva(){
    override fun prayer(){
        println("Krishna's krishna")
    }
}


fun main() {
  var s = Shiva()
    s.prayer()
    s = Rama()
    s.prayer()
    s = Krishna()
    s.prayer()
}