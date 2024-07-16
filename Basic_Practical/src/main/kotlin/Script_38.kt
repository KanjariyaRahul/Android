//38. Enter age of person and display message as
//Up to 5 year Kid
//5- 12 Children
//13 – 19 Teenager
//20 – 30 Young
//31 – 60 Mid age group
//60 or above Old

fun main() {
    print("Enter the age of the person : ")
    var age = readLine()?.toIntOrNull()

    if(age!=null){
        if(age<=5){
            println("Up to 5 years: Kid")
        }else if (age in 6 ..12){
            println("5-12 years: Children")
        }else if(age in 13 ..19){
            println("13-19 years: Teenager")
        }else if(age in 20 ..30){
            println("20-30 years: Young")
        } else if (age in 31..60) {
            println("31-60 years: Mid age group")
        } else if (age >= 61) {
            println("60 years and above: Old")
        } else {
            println("Invalid age")
        }
    } else {
        println("Please enter a valid number.")
    }
}