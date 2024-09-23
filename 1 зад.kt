fun main() {
    // 1. Вывод информации о типах данных
    println("## Типы данных в Kotlin:")
    println("- Целочисленные:")
    println("  - Byte (8 бит)")
    println("  - Short (16 бит)")
    println("  - Int (32 бит)")
    println("  - Long (64 бит)")
    println("- Вещественные:")
    println("  - Float (32 бит)")
    println("  - Double (64 бит)")
    println("- Логический:")
    println("  - Boolean (true/false)")
    println("- Строковый:")
    println("  - String")
    println("- Символьный:")
    println("  - Char")
    println("- Перечисление:")
    println("  - Enum")
    println("- Массивы:")
    println("  - Array")
    println("- Коллекции:")
    println("  - List")
    println("  - Set")
    println("  - Map")

    // 2. Вывод числа с точностью до сотых
    val number = 3.141592653589793
    println("Число с точностью до сотых: %.2f".format(number))

    // 3. Вывод числа e с точностью до десятых
    val e = Math.E
    println("Число e с точностью до десятых: %.1f".format(e))

    // 4. Вывод числа, введенного с клавиатуры
    print("Введите число: ")
    val inputNumber = readLine()!!.toInt()
    println("Вы ввели число: $inputNumber")

    // 5. Вывод числа с сообщением
    print("Введите число: ")
    val inputNumber2 = readLine()!!.toInt()
    println("$inputNumber2 — вот какое число Вы ввели")

    // 6. Вывод чисел в одну строку с одним пробелом
    println("1 13 49")

    // 7. Вывод чисел в одну строку с двумя пробелами
    println("7  15  100")

    // 8. Вывод трех чисел с двумя пробелами
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()
    print("Введите третье число: ")
    val num3 = readLine()!!.toInt()
    println("$num1  $num2  $num3")

    // 9. Вывод четырех чисел с одним пробелом
    print("Введите первое число: ")
    val num4 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num5 = readLine()!!.toInt()
    print("Введите третье число: ")
    val num6 = readLine()!!.toInt()
    print("Введите четвертое число: ")
    val num7 = readLine()!!.toInt()
    println("$num4 $num5 $num6 $num7")

    // 10. Вывод чисел 50 и 10 одно под другим
    println("50")
    println("10")

    // 11. Вывод чисел 5, 10 и 21 одно под другим
    println("5")
    println("10")
    println("21")

    // 12. Вывод четырех чисел "столбиком"
    print("Введите первое число: ")
    val num8 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num9 = readLine()!!.toInt()
    print("Введите третье число: ")
    val num10 = readLine()!!.toInt()
    print("Введите четвертое число: ")
    val num11 = readLine()!!.toInt()
    println("$num8")
    println("$num9")
    println("$num10")
    println("$num11")
}