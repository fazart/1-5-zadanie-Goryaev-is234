fun main() {
    // Операции с числами
    // 1. Двузначное число
    val twoDigitNumber = 58
    println("Двузначное число: $twoDigitNumber")
    println("Десятки: ${twoDigitNumber / 10}")
    println("Единицы: ${twoDigitNumber % 10}")
    println("Сумма цифр: ${twoDigitNumber / 10 + twoDigitNumber % 10}")
    println("Произведение цифр: ${twoDigitNumber / 10 * twoDigitNumber % 10}")

    // 2. Трехзначное число
    val threeDigitNumber = 345
    println("\nТрехзначное число: $threeDigitNumber")
    println("Единицы: ${threeDigitNumber % 10}")
    println("Десятки: ${threeDigitNumber / 10 % 10}")
    println("Сумма цифр: ${threeDigitNumber / 100 + threeDigitNumber / 10 % 10 + threeDigitNumber % 10}")
    println("Произведение цифр: ${threeDigitNumber / 100 * threeDigitNumber / 10 % 10 * threeDigitNumber % 10}")

    // 3. Деление чисел
    val dividend = 10
    val divisor = 3
    println("\nДелимое: $dividend")
    println("Делитель: $divisor")
    println("Результат деления: ${dividend / divisor}")

    // 4. Возведение в степень
    val base = 2
    val exponent = 5
    println("\nЧисло: $base")
    println("Степень: $exponent")
    println("Результат возведения в степень: ${Math.pow(base.toDouble(), exponent.toDouble())}")

    // 5. Корень числа
    val number = 25
    println("\nЧисло: $number")
    println("Корень числа: ${Math.sqrt(number.toDouble())}")

    // Вычисление логических выражений
    // 1.
    val A = true
    val B = false
    val C = false
    println("\nЛогические величины: A = $A, B = $B, C = $C")
    println("a) A или В: ${A || B}")
    println("b) A и В: ${A && B}")
    println("c) В или C: ${B || C}")

    // 2.
    val X = false
    val Y = true
    val Z = false
    println("\nЛогические величины: X = $X, Y = $Y, Z = $Z")
    println("a) X или Z: ${X || Z}")
    println("b) X и Y: ${X && Y}")
    println("c) X и Z: ${X && Z}")

    // 3.
    println("\nЛогические величины: A = $A, B = $B, C = $C")
    println("a) не А и В: ${!A && B}")
    println("b) A или не В: ${A || !B}")
    println("c) A и В или С: ${A && B || C}")

    // 4.
    println("\nЛогические величины: X = $X, Y = $Y, Z = $Z")
    println("a) не X и Y: ${!X && Y}")
    println("b) X или не Y: ${X || !Y}")
    println("c) X или Y и Z: ${X || Y && Z}")

    // 5.
    println("\nЛогические величины: X = $X, Y = $Y, Z = $Z")
    println("a) не X и Y: ${!X && Y}")
    println("b) X или не Y: ${X || !Y}")
    println("c) X или Y и Z: ${X || Y && Z}")

    // 6.
    val X1 = false
    val Y1 = false
    val Z1 = true
    println("\nЛогические величины: X = $X1, Y = $Y1, Z = $Z1")
    println("a) X или Y и не Z: ${X1 || Y1 && !Z1}")
    println("b) не X и не Y: ${!X1 && !Y1}")
    println("c) не (X и Z) или Y: ${! (X1 && Z1) || Y1}")
    println("d) X и не Y или Z: ${X1 && !Y1 || Z1}")
    println("e) X и (не Y или Z): ${X1 && (!Y1 || Z1)}")
    println("f) X или (не (Y или Z)): ${X1 || ! (Y1 || Z1)}")

    // 7.
    println("\nЛогические величины: A = $A, B = $B, C = $C")
    println("a) A или не (A и В) или С: ${A || ! (A && B) || C}")
    println("b) не А или А и (В или С): ${!A || A && (B || C)}")
    println("c) (A или В и не С) и С: ${ (A || B && !C) && C }")
}