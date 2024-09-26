fun areNumbersEqual(num1: Int, num2: Int): Boolean {
    return num1 == num2
}

fun main() {
    println("Введите первое число:")
    val number1 = readLine()!!.toInt()

    println("Введите второе число:")
    val number2 = readLine()!!.toInt()

    if (areNumbersEqual(number1, number2)) {
        println("Числа равны.")
    } else {
        println("Числа не равны.")
    }
}
