fun main() {
    //1)
    //1 2 3 4 5
    //1 2 3 4 5
    //1 2 3 4 5
    //1 2 3 4 5
    //1 2 3 4 5
    println("--------- 1 pattern ----------")
    for( i in 1 .. 5 ){
        for( j in 1 .. 5){
            print("$j ")
        }
        println()
    }
    //2)
    //1 1 1 1 1
    //2 2 2 2 2
    //3 3 3 3 3
    //4 4 4 4 4
    //5 5 5 5 5

    println("--------- 2 pattern ----------")
    for( i in 1 .. 5 ){
        for( j in 1 .. 5){
            print("$i ")
        }
        println()
    }
    //3)
    //1 2 3 4 5
    //2 4 6 8 10
    //3 6 9 12 15
    //4 8 12 16 20
    //5 10 15 20 25
    println("--------- 3 pattern ----------")
    for( i in 1 .. 5 ){
        for( j in 1 .. 5){
            print("${i * j}" + " ")
        }
        println()
    }

    //4)
    //A A A A A
    //B B B B B
    //C C C C C
    //D D D D D
    //E E E E E

    println("--------- 4 pattern ----------")
    for( i in 'A' .. 'E' ){
        for( j in 'A' .. 'E'){
            print("$i ")
        }
        println()
    }
    //5)
    //1 2 3 4 5
    //$ 2 3 4 5
    //$ $ 3 4 5
    //$ $ $ 4 5
    //$ $ $ $ 5

    println("--------- 5 pattern ----------")
    for( i in 1 .. 5 ){
        for( j in  1.. 5){
            if (j < i) {
                print("$ ")
            } else {
                print("$j ")
            }
        }
        println()
    }
    //6)
    // 1 $ $ $ $
    // 2 2 $ $ $
    // 3 3 3 $ $
    // 4 4 4 4 $
    // 5 5 5 5 5

    println("--------- 6 pattern ----------")

    for( i in 1 .. 5 ){
        for( j in  1.. 5){
            if (i < j) {
                print("$ ")
            } else {
                print("$i ")
            }
        }
        println()
    }
    //6)
    // X 0 0 0 0
    // X X 0 0 0
    // X X X 0 0
    // X X X X 0
    // X X X X X

    println("--------- 7 pattern ----------")

    for( i in 1 .. 5 ){
        for( j in  1.. 5){
            if (i < j) {
                print("0 ")
            } else {
                print("X ")
            }
        }
        println()
    }
    //8)
    // * * * * *
    // *       *
    // *       *
    // *       *
    // * * * * *

    println("--------- 8 pattern ----------")

    for( i in 1 .. 5 ){

        for( j in  1.. 5){
            if(i==1 || j==1 || i==5 || j==5  ) {
                print("* ")
            }
            else{
                print("  ")
            }
        }
        println()
    }

    //9)
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5

    println("--------- 9 pattern ----------")

    for( i in 1 .. 5 ){

        for( j in  1.. i){
            print("$i ")
        }
        println()
    }

    //10)
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    println("--------- 10 pattern ----------")

    for( i in 1 .. 5 ){

        for( j in  1.. i){
            print("$j ")
        }
        println()
    }
    //11)
    // 5
    // 5 4
    // 5 4 3
    // 5 4 3 2
    // 5 4 3 2 1
    println("--------- 11 pattern ----------")

    for( i in 5  downTo   1 ){
        for( j in  5 downTo  i){
            print("$j ")
        }
        println()
    }

    // 12)
    // 1
    // 2 1
    // 3 2 1
    // 4 3 2 1
    // 5 4 3 2 1
    println("--------- 12 pattern ----------")

    for( i in 1  ..   5 ){
        for( j in  i downTo   1){
            print("$j ")
        }
        println()
    }
    // 13)
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    println("--------- 13 pattern ----------")

    var number =1
    for (i in  1 .. 5){
        for( j in  1 .. i){
            print("$number ")
            number++
        }
        println()
    }
    // 14)
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    println("--------- 14 pattern ----------")

    for( i in 1 .. 5 ){
        for( j in  1 .. i){
            if((i+j) % 2 == 0 ){
                print("1 ")
            }else{
                print("0 ")
            }
        }
        println()
    }

    // 15)
    // 1
    // 1 0
    // 1 0 1
    // 1 0 1 0
    // 1 0 1 0 1
    println("--------- 15 pattern ----------")

    for( i in 1 .. 5 ){
        for( j in  1 .. i){
            if( j % 2 == 0 ){
                print("0 ")
            }else{
                print("1 ")
            }
        }
        println()
    }
    // 16)
    // A
    // B C
    // D E F
    // G H I J
    // K L M N O
    println("--------- 16 pattern ----------")

    var char ='A'
    for (i in  1 .. 5){
        for( j in  1 .. i){
            print("$char ")
            char++
        }
        println()
    }

    //17)
    //    *
    //   **
    //  ***
    // ****
    //*****
    println("--------- 17 pattern ----------")

    for (i in 1..5) {
        for (j in 1..(5 - i)) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
        }
        println()
    }

    //18)
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    println("--------- 18 pattern ----------")

    for(i in 1 .. 5){
        for (j in 5 downTo i){
            print("* ")
        }
        println()
    }

    //19)
    //    *
    //   * *
    //  * * *
    // * * * *
    //* * * * *
    println("--------- 19 pattern ----------")

    for( i in 1 ..  5){
        for (j in 1..(5 - i)) {
            print(" ")
        }
        for (k in 1..i) {
            print("* ")
        }
        println()
    }

}
