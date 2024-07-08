fun main() {
    // Get a string from the user
    print("Enter a string: ")
    val input = readLine()!!

    // Define vowels
    val vowels = "aeiouAEIOU"

    // Iterate over each character in the string
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
