fun calculatePoints(wins: Int, draws: Int, losses: Int): Int {
    return wins * 3 + draws * 1 + losses * 0
}

fun main() {
    println("Введите количество побед:")
    val wins = readLine()!!.toInt()
    println("Введите количество ничей:")
    val draws = readLine()!!.toInt()
    println("Введите количество поражений:")
    val losses = readLine()!!.toInt()

    val points = calculatePoints(wins, draws, losses)
    println("Команда набрала $points очков.")
}
