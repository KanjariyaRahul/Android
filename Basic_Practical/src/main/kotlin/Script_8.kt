//8. The distance between two cities is input through keyboard. Write a program to convertand print
//this distance in feet, meter, inch and centimeter

fun main() {
    print("Enter the distance between two cities (in kilometers): ")
    var distanceKm = readLine()?.toDoubleOrNull()

    if(distanceKm!= null && distanceKm>=0){
        println("------------------ Your distance between two cities ------------")
        var feet = distanceKm * 3280.84
        println("Distance in feet: $feet feet")

        var meter = distanceKm * 1000
        println("Distance in Meter : $meter meter")

        var inch = distanceKm * 39370.1
        println("Distance in Inch : $inch km")

        var centimeter = distanceKm * 100000
        println("Distance in Centimeter : $centimeter km")
    }else{
        println("Invalid input. Distance should be a non-negative number.")
    }
}