enum class Suit {
    ЧЕРВИ, КРЕСТИ, БУБИ, ПИКИ
}

enum class Rank(val value: Int) {
    ДВА(2), ТРИ(3), ЧЕТЫРЕ(4), ПЯТЬ(5), ШЕСТЬ(6),
    СЕМЬ(7), ВОСЕМЬ(8), ДЕВЯТЬ(9), ДЕСЯТЬ(10),
    ВАЛЕТ(10), ДАМА(10), КОРОЛЬ(10), ТУЗ(11)
}

data class Card(val suit: Suit, val rank: Rank)

class Deck {
    private val cards = mutableListOf<Card>()

    init {
        for (suit in Suit.values()) {
            for (rank in Rank.values()) {
                cards.add(Card(suit, rank))
            }
        }
        cards.shuffle()
    }

    fun drawCard(): Card = cards.removeAt(cards.size - 1)
}

class Hand {
    private val cards = mutableListOf<Card>()

    fun addCard(card: Card) {
        cards.add(card)
    }

    fun calculateValue(): Int {
        var totalValue = 0
        var aceCount = 0

        for (card in cards) {
            totalValue += card.rank.value
            if (card.rank == Rank.ТУЗ) aceCount++
        }

        while (totalValue > 21 && aceCount > 0) {
            totalValue -= 10
            aceCount--
        }

        return totalValue
    }

    override fun toString(): String = cards.joinToString(", ") { "${it.rank} of ${it.suit}" }
}

class Player(val name: String) {
    val hand = Hand()

    fun playTurn(deck: Deck): Boolean {
        while (true) {
            println("$name's hand: ${hand} (value: ${hand.calculateValue()})")
            if (hand.calculateValue() >= 21) break

            println("Do you want to hit or stand? (h/s)")
            when (readLine()) {
                "h" -> hand.addCard(deck.drawCard())
                "s" -> break
                else -> println("Invalid input. Please enter 'h' or 's'.")
            }
        }
        return hand.calculateValue() <= 21
    }
}

fun main() {
    val deck = Deck()

    val player = Player("Player")
    val dealer = Player("Dealer")

    // Initial deal
    repeat(2) {
        player.hand.addCard(deck.drawCard())
        dealer.hand.addCard(deck.drawCard())
    }

    // Player's turn
    if (!player.playTurn(deck)) {
        println("${player.name} busts! Dealer wins.")
        return
    }

    // Dealer's turn
    while (dealer.hand.calculateValue() < 17) {
        dealer.hand.addCard(deck.drawCard())
    }

    println("${dealer.name}'s hand: ${dealer.hand} (value: ${dealer.hand.calculateValue()})")

    // Determine winner
    when {
        dealer.hand.calculateValue() > 21 || player.hand.calculateValue() > dealer.hand.calculateValue() ->
            println("${player.name} wins!")

        player.hand.calculateValue() < dealer.hand.calculateValue() ->
            println("${dealer.name} wins!")

        else -> println("It's a tie!")
    }
}
