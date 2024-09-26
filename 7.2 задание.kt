fun isPalindrome(word: String): Boolean {
    return word == word.reversed()
}

fun main() {
    println("Введите слово для проверки палиндрома:")
    val word = readLine()!!
    if (isPalindrome(word)) {
        println("$word является палиндромом.")
    } else {
        println("$word не является палиндромом.")
    }
}
