
fun main() {
//    pattern 1
//    *
//    * *
//    * * *
//    * * * *
//    * * * * *

    for (i in 1..5) {
        for(j in 1 .. i)
        {
            print("* ")
        }
        println("")
    }
    println()

//    Patterns 2
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *

    for (i in 1..5) {
        for(j in 1 .. 5)
        {
            print("* ")
        }
        println("")
    }
    println()

//    Patterns 3
//            *
//          * *
//        * * *
//      * * * *
//    * * * * *

    for (i in 1..5) {
        for (j in 1..5 - i) {
            print("  ")
        }
        for (k in 1..i) {
            print("* ")
        }
        println()
    }
    println()

//    Patterns 4
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *

    for (i in 1..5) {
        for(j in 1 .. 5-i){
            print(" ")
        }
        for(k in 1 .. i) {
            print("* ")
        }
        println(" ")
    }

}