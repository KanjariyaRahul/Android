fun main() {

    print("Enter a string: ")
    val input = readLine()!!

    val vowels = "aeiouAEIOU"

    for (char in input) {
        if (char in vowels) {
            println("$char is a vowel")
        } else if (char.isLetter()) {
            println("$char is a consonant")
        } else {
            println("$char is not a letter")
        }
    }
}


