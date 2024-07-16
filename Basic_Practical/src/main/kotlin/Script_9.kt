import kotlin.math.pow

//9. Write a program to find volume of cylinder (v = 3.14r2h )

fun main() {

    var PI = 3.14
    var radius = 5.0
    var height = 5

    var volume = PI * radius.pow(2)* height

    println("Volume of the cylinder: $volume cubic units")
}