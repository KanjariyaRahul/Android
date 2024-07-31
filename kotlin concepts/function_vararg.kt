fun printAll(vararg msg : String){
    for (m in msg){
        println("$m ")
    }
}

fun printAllwithPrefix(vararg msg : String , prefix : String = "info"){
    for (m in msg){
        println()
        print("Prefix = $prefix || Name  = $msg")
    }
}


fun main() {
    printAll("hello", "rahul" , "kanjariya")
    println()
    print(prefix = "hello", "hi" , msg = "java", "python" , "kotlin" , "php")
}