//40. Write a program input 5 subject marks and find class and result

fun main() {
    val numberOfSubjects = 5

    var totalMarks = 0


    for( i in 1..numberOfSubjects) {
        print("Enter marks for subject ${i}: ")
        val marks = readLine()!!.toInt()
        totalMarks += marks
    }

    println("-----------------------------------")
    val averageMarks = totalMarks / numberOfSubjects
    println("\nAverage marks: $averageMarks")

    if (averageMarks >= 70) {
        print("Result: Distinction")
    } else if (averageMarks >= 60) {
        println("Result: First Class")
    } else if (averageMarks >= 50) {
        println("Result: Second Class")
    } else if (averageMarks >= 40) {
        println("Result: Pass")
    } else {
        println("you have failed. Please work harder. Fail")
    }
}
