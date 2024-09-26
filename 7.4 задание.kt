fun findMin(numbers: List<Int>): Int? {
    return numbers.minOrNull()
}

fun main() {
    println("Введите список чисел через пробел:")
    val numbers = readLine()!!.split(" ").map { it.toInt() }

    val minNumber = findMin(numbers)

    if (minNumber != null) {
        println("Самое маленькое число в списке: $minNumber")
    } else {
        println("Список пуст.")
    }
}
