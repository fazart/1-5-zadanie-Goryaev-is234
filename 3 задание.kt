import kotlin.math.abs

fun main() {
    // Пример ввода данных (можно использовать Scanner для ввода с клавиатуры)
    val num1 = 10
    val num2 = 7
    val num3 = 15

    // Задача 1: Найти максимальное число
    val maxNumber = maxOf(num1, num2, num3)
    println("Максимальное число: $maxNumber")

    // Задача 2: Найти среднее из трех чисел или вывести ошибку, если есть равные числа
    val average = when {
        num1 == num2 || num1 == num3 || num2 == num3 -> {
            println("Ошибка: Есть равные числа.")
            null
        }
        else -> (num1 + num2 + num3) / 3.0
    }
    average?.let { println("Среднее число: $it") }

    // Задача 3: Вывести нечетное число из двух чисел с разной четностью
    val oddNumber = if (num1 % 2 != num2 % 2) {
        if (num1 % 2 != 0) num1 else num2
    } else {
        null
    }
    oddNumber?.let { println("Нечетное число среди $num1 и $num2: $it") }

    // Задача 4: Проверить, кратно ли первое число второму
    val larger = maxOf(num1, num2)
    val smaller = minOf(num1, num2)
    val divisible = if (larger % smaller == 0) {
        val remainder = larger % smaller
        "Кратно, остаток от деления: $remainder"
    } else {
        "Не кратно"
    }
    println("Проверка на кратность: $divisible")

    // Задача 5: Проверить, может ли существовать треугольник с заданными сторонами
    val trianglePossible = when {
        num1 >= num2 + num3 || num2 >= num1 + num3 || num3 >= num1 + num2 -> false
        else -> true
    }
    println("Может ли существовать треугольник с сторонами $num1, $num2, $num3: $trianglePossible")

    // Задача 6: Определить, является ли год високосным
    val year = 2024 // пример ввода года
    val isLeapYear = when {
        year % 400 == 0 -> true
        year % 100 == 0 -> false
        year % 4 == 0 -> true
        else -> false
    }
    val daysInYear = if (isLeapYear) 366 else 365
    println("Год $year ${if (isLeapYear) "високосный" else "не високосный"}. В нем $daysInYear дней.")

    // Задача 7: Определить большее и меньшее из двух чисел
    val biggerNumber = maxOf(num1.toDouble(), num2.toDouble())
    val smallerNumber = minOf(num1.toDouble(), num2.toDouble())
    println("Из чисел $num1 и $num2, большее: $biggerNumber, меньшее: $smallerNumber")

    // Задача 8: Определить, какое из расстояний меньше
    val distanceInKm = 10.0
    val distanceInFeet = 100.0
    val distanceInMeters = distanceInFeet * 0.305
    val smallerDistance = minOf(distanceInKm, distanceInMeters)
    println("Меньшее расстояние: ${if (smallerDistance == distanceInKm) "$distanceInKm км" else "$distanceInMeters м"}")

    // Задача 9: Проверить деление m на n нацело
    val m = 15
    val n = 5
    val result = if (m % n == 0) "Частное: ${m / n}" else "m на n нацело не делится"
    println(result)

    // Задача 10: Проверить, является ли число a делителем числа b
    val a = 7
    val b = 42
    val isDivisor = if (b % a == 0) "Является делителем" else "Не является делителем"
    println("Число $a $isDivisor числа $b")

    // Задача 11: Определить четность и оканчивание на 7
    val naturalNumber = 27 // пример ввода
    val isEven = naturalNumber % 2 == 0
    val endsWith7 = naturalNumber % 10 == 7
    println("Число $naturalNumber: ${if (isEven) "четное" else "нечетное"}, " +
            "${if (endsWith7) "заканчивается на 7" else "не заканчивается на 7"}")

    // Задача 12: Определить свойства двузначного числа
    val twoDigitNumber = 58 // пример ввода
    val firstDigit = twoDigitNumber / 10
    val secondDigit = twoDigitNumber % 10
    val largerDigit = maxOf(firstDigit, secondDigit)
    val digitsEqual = firstDigit == secondDigit
    println("Для числа $twoDigitNumber: большая цифра - $largerDigit, " +
            "${if (digitsEqual) "цифры равны" else "цифры не равны"}")

    // Задача 13: Определить свойства четырехзначного числа
    val fourDigitNumber = 1234 // пример ввода
    val firstTwoDigitsSum = (fourDigitNumber / 1000) + (fourDigitNumber / 100 % 10)
    val lastTwoDigitsSum = (fourDigitNumber / 10 % 10) + (fourDigitNumber % 10)
    val isSumEqual = firstTwoDigitsSum == lastTwoDigitsSum
    val isSumDivisibleBy3 = (firstTwoDigitsSum + lastTwoDigitsSum) % 3 == 0
    val isProductDivisibleBy4 = (fourDigitNumber / 1000) * (fourDigitNumber % 10) % 4 == 0
    val isProductDivisibleByA = (fourDigitNumber / 1000) * (fourDigitNumber / 100 % 10) % a == 0
    println("Для числа $fourDigitNumber: " +
            "${if (isSumEqual) "сумма первых двух цифр равна сумме последних двух" else "суммы не равны"}, " +
            "${if (isSumDivisibleBy3) "сумма цифр кратна 3" else "сумма цифр не кратна 3"}, " +
            "${if (isProductDivisibleBy4) "произведение цифр кратно 4" else "произведение цифр не кратно 4"}, " +
            "${if (isProductDivisibleByA) "произведение цифр кратно $a" else "произведение цифр не кратно $a"}")
}