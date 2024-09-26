fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toDouble()
    println("Введите оператор (+, -, *, /):")
    val operator = readLine()!!
    println("Введите второе число:")
    val num2 = readLine()!!.toDouble()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Деление на ноль!"
        else -> "Неверный оператор"
    }

    println("Результат: $result")
}