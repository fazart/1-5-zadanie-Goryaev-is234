import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // 1. Вывод чисел от 1 до 10
    println("1. Вывод чисел от 1 до 10:")
    for (i in 1..10) {
        print("$i ")
    }
    println("\n")

    // 2. Вывод четных чисел от 1 до 20
    println("2. Вывод четных чисел от 1 до 20:")
    for (i in 2..20 step 2) {
        print("$i ")
    }
    println("\n")

    // 3. Сумма чисел от 1 до N
    println("3. Сумма чисел от 1 до N. Введите N:")
    var n = scanner.nextInt()
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println("Сумма чисел от 1 до $n = $sum\n")

    // 4. Факториал числа
    println("4. Факториал числа. Введите число:")
    var num = scanner.nextInt()
    var factorial = 1L
    for (i in 1..num) {
        factorial *= i
    }
    println("Факториал числа $num = $factorial\n")

    // 5. Проверка числа на простоту
    println("5. Проверка числа на простоту. Введите число:")
    num = scanner.nextInt()
    var prime = true
    if (num < 2) prime = false
    for (i in 2..num/2) {
        if (num % i == 0) {
            prime = false
            break
        }
    }
    if (prime) {
        println("$num - простое число")
    } else {
        println("$num - составное число")
    }
    println()

    // 6. Вывод таблицы умножения от 1 до 10
    println("6. Вывод таблицы умножения от 1 до 10:")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j}\t")
        }
        println()
    }
    println()

    // 7. Фибоначчи
    println("7. Генерация первых N чисел Фибоначчи. Введите N:")
    n = scanner.nextInt()
    var a = 0
    var b = 1
    print("Первые $n чисел Фибоначчи:")
    for (i in 1..n) {
        print(" $a")
        val sum = a + b
        a = b
        b = sum
    }
    println("\n")

    // 8. Наибольший общий делитель (НОД)
    println("8. Нахождение НОД двух чисел. Введите первое число:")
    var num1 = scanner.nextInt()
    println("Введите второе число:")
    var num2 = scanner.nextInt()
    var gcd = 1
    for (i in 1..num1.coerceAtMost(num2)) {
        if (num1 % i == 0 && num2 % i == 0) {
            gcd = i
        }
    }
    println("НОД чисел $num1 и $num2 = $gcd\n")

    // 9. Обратный порядок строки
    println("9. Вывод строки в обратном порядке. Введите строку:")
    scanner.nextLine() // consume newline left from previous nextInt()
    var inputStr = scanner.nextLine()
    println("Строка в обратном порядке:")
    for (i in inputStr.length - 1 downTo 0) {
        print(inputStr[i])
    }
    println("\n")

    // 10. Сумма цифр числа
    println("10. Сумма цифр числа. Введите число:")
    num = scanner.nextInt()
    var sumDigits = 0
    var number = num
    while (number != 0) {
        sumDigits += number % 10
        number /= 10
    }
    println("Сумма цифр числа $num = $sumDigits\n")

    // 11. Анаграммы
    println("11. Проверка на анаграммы. Введите первую строку:")
    var str1 = scanner.next()
    println("Введите вторую строку:")
    var str2 = scanner.next()
    val sortedStr1 = str1.toCharArray().sorted()
    val sortedStr2 = str2.toCharArray().sorted()
    if (sortedStr1 == sortedStr2) {
        println("Строки $str1 и $str2 являются анаграммами")
    } else {
        println("Строки $str1 и $str2 не являются анаграммами")
    }
    println()

    // 12. Числовая последовательность
    println("12. Генерация числовой последовательности. Введите начальное число:")
    var startNum = scanner.nextInt()
    println("Введите шаг:")
    var step = scanner.nextInt()
    println("Введите количество элементов:")
    n = scanner.nextInt()
    println("Числовая последовательность:")
    for (i in 0 until n) {
        print("${startNum + i * step} ")
    }
    println("\n")

    // 13. Таблица квадратов чисел от 1 до 20
    println("13. Таблица квадратов чисел от 1 до 20:")
    for (i in 1..20) {
        println("$i * $i = ${i * i}")
    }
    println()
    // 14. Генерация случайных чисел
    println("14. Генерация 10 случайных чисел от 1 до 100:")
    val random = Random()
    for (i in 1..10) {
        print("${random.nextInt(100) + 1} ")
    }
    println("\n")

    // 15. Проверка палиндрома
    println("15. Проверка на палиндром. Введите строку:")
    scanner.nextLine() // consume newline left from previous nextInt()
    inputStr = scanner.nextLine()
    var isPalindrome = true
    for (i in 0 until inputStr.length / 2) {
        if (inputStr[i] != inputStr[inputStr.length - i - 1]) {
            isPalindrome = false
            break
        }
    }
    if (isPalindrome) {
        println("Строка $inputStr является палиндромом")
    } else {
        println("Строка $inputStr не является палиндромом")
    }
    println()

    // 16. Сигма (сумма квадратов)
    println("16. Нахождение суммы квадратов чисел от 1 до N. Введите N:")
    n = scanner.nextInt()
    var sumSquares = 0
    for (i in 1..n) {
        sumSquares += i * i
    }
    println("Сумма квадратов чисел от 1 до $n = $sumSquares\n")

    // 17. Вывод символов строки по одному
    println("17. Вывод символов строки по одному. Введите строку:")
    scanner.nextLine() // consume newline left from previous nextInt()
    inputStr = scanner.nextLine()
    println("Символы строки по одному:")
    for (char in inputStr) {
        println(char)
    }
    println()

    // 18. Задача на лестницу
    println("18. Вывод лестницы из символа '#' по высоте N. Введите N:")
    n = scanner.nextInt()
    println("Лестница из символа '#' высотой $n:")
    for (i in 1..n) {
        println("#".repeat(i))
    }
    println()

    // 19. Сортировка списка двухзначных чисел
    println("19. Простая сортировка двухзначных чисел в массиве:")
    val array = arrayOf(56, 12, 78, 34, 90, 23, 45, 67, 89)
    println("Исходный массив: ${array.joinToString()}")
    for (i in 0 until array.size - 1) {
        for (j in i + 1 until array.size) {
            if (array[i] > array[j]) {
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
    }
    println("Отсортированный массив: ${array.joinToString()}")
    println()

    // 20. Вывод простых чисел в диапазоне
    println("20. Вывод всех простых чисел в заданном диапазоне. Введите начало диапазона:")
    var start = scanner.nextInt()
    println("Введите конец диапазона:")
    var end = scanner.nextInt()
    println("Простые числа в диапазоне от $start до $end:")
    for (num in start..end) {
        if (isPrime(num)) {
            print("$num ")
        }
    }
    println("\n")

    // 21. Вывод даты
    println("21. Вывод всех дат в заданном году и месяце. Введите год:")
    val year = scanner.nextInt()
    println("Введите номер месяца (1 - январь, ..., 12 - декабрь):")
    val month = scanner.nextInt()
    val daysInMonth = when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
        else -> 0
    }
    println("Даты в $month.$year:")
    for (day in 1..daysInMonth) {
        println("$day.$month.$year")
    }
    println()

    // 22. Угадай число
    println("22. Игра \"Угадай число\" от 1 до 100. У вас 7 попыток.")
    val randomNumber = Random().nextInt(100) + 1
    var attempts = 7
    var guessed = false
    while (attempts > 0) {
        print("Угадайте число (осталось попыток: $attempts): ")
        val guess = scanner.nextInt()
        if (guess == randomNumber) {
            println("Поздравляем! Вы угадали число $randomNumber!")
            guessed = true
            break
        } else if (guess < randomNumber) {
            println("Загаданное число больше.")
        } else {
            println("Загаданное число меньше.")
        }
        attempts--
    }
    if (!guessed) {
        println("Игра окончена. Вы не угадали число $randomNumber.")
    }
    println()

// 23. Сложение и умножение
    println("23. Сложение и умножение двух чисел. Введите первое число:")
    num1 = scanner.nextInt()
    println("Введите второе число:")
    num2 = scanner.nextInt()
    var operation = ""
    var result = 0
    while (true) {
        print("Выберите операцию (сложение/умножение) или \"стоп\" для завершения: ")
        operation = scanner.next().toLowerCase()
        if (operation == "стоп") break
        when (operation) {
            "сложение" -> {
                result = num1 + num2
                println("Результат сложения $num1 и $num2 = $result")
            }
            "умножение" -> {
                result = num1 * num2
                println("Результат умножения $num1 и $num2 = $result")
            }
            else -> println("Некорректная операция. Попробуйте ещё раз.")
        }
    }
    println()

    // 24. Транспонирование матрицы
    println("24. Транспонирование матрицы 3x3.")
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    println("Исходная матрица:")
    for (row in matrix) {
        println(row.joinToString())
    }
    println("Транспонированная матрица:")
    val transposedMatrix = Array(3) { IntArray(3) }
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }
    for (row in transposedMatrix) {
        println(row.joinToString())
    }
    println()

    // 25. Кубы чисел от 1 до 10
    println("25. Кубы чисел от 1 до 10:")
    for (i in 1..10) {
        println("$i^3 = ${i * i * i}")
    }
    println()

    // 26. Сумма четных и нечетных чисел от 1 до N
    println("26. Сумма четных и нечетных чисел от 1 до N. Введите N:")
    n = scanner.nextInt()
    var sumEven = 0
    var sumOdd = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            sumEven += i
        } else {
            sumOdd += i
        }
    }
    println("Сумма четных чисел от 1 до $n = $sumEven")
    println("Сумма нечетных чисел от 1 до $n = $sumOdd\n")

    // 27. Печать числовой "пирамиды"
    println("27. Печать \"пирамиды\" из чисел от 1 до N. Введите N:")
    n = scanner.nextInt()
    for (i in 1..n) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
    println()

    // 28. Определение порядка
    println("28. Вывод чисел в порядке возрастания. Введите количество чисел:")
    n = scanner.nextInt()
    val numbers = mutableListOf<Int>()
    println("Введите $n чисел:")
    for (i in 1..n) {
        numbers.add(scanner.nextInt())
    }
    println("Числа в порядке возрастания:")
    numbers.sort()
    println(numbers.joinToString())
    println()

    // 29. Сумма ряда
    println("29. Нахождение суммы ряда 1 + 1/2 + 1/3 + ... + 1/N. Введите N:")
    n = scanner.nextInt()
    var seriesSum = 0.0
    for (i in 1..n) {
        seriesSum += 1.0 / i
    }
    println("Сумма ряда 1 + 1/2 + 1/3 + ... + 1/$n = $seriesSum\n")

    // 30. Конвертация в двоичную систему
    println("30. Конвертация числа в двоичную систему. Введите целое число:")
    num = scanner.nextInt()
    println("Число $num в двоичной системе: ${Integer.toBinaryString(num)}\n")

    scanner.close()
}

fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    for (i in 2..number/2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}