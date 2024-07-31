fun main() {
    var myarray1 =Array<Int>(5){0}
    var myarray2 = arrayOf(1,2,3,4,5)
    var myarray3 = arrayOf<Int>(4,5,6,8,2,3,)
    var myarray4 = arrayOf<String>("hello" , "rahul" , "kanjariya")
    var myarray5 = arrayOf(1,"rahul" , 2, "kanjariya" , 3 , "hello")

    println(myarray1[3])
    println(myarray2[4])
    println(myarray3[5])
    println(myarray4[1])

    for(e in myarray5)
    {
        print("$e ")
    }
    
//    println(myarray5)
}