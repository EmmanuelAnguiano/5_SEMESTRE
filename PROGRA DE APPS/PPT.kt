fun main() {
    println(rockScissorsPaper(arrayListOf(Pair(Move.ROCK, Move.ROCK))))

    println(rockScissorsPaper(arrayListOf(Pair(Move.ROCK, Move.SCISSORS))))

    println(rockScissorsPaper(arrayListOf(Pair(Move.PAPER, Move.SCISSORS))))
    
    println(rockScissorsPaper(arrayListOf(
        Pair(Move.ROCK, Move.ROCK),
        Pair(Move.SCISSORS, Move.SCISSORS),
        Pair(Move.PAPER, Move.PAPER))))
    println(rockScissorsPaper(arrayListOf(
        Pair(Move.ROCK, Move.SCISSORS),
        Pair(Move.SCISSORS, Move.PAPER),
        Pair(Move.SCISSORS, Move.ROCK))))
    println(rockScissorsPaper(arrayListOf(
        Pair(Move.ROCK, Move.PAPER),
        Pair(Move.SCISSORS, Move.ROCK),
        Pair(Move.PAPER, Move.SCISSORS))))
}

enum class Move {
    ROCK, SCISSORS, PAPER
}

private fun rockScissorsPaper(games: List<Pair<Move, Move>>): String {

    var playerOneGames = 0
    var playerTwoGames = 0

    games.forEach { game ->

        val playerOneMove = game.first
        val playerTwoMove = game.second

        if (playerOneMove != playerTwoMove) {

            if (playerOneMove == Move.ROCK && playerTwoMove == Move.SCISSORS
                || playerOneMove == Move.SCISSORS && playerTwoMove == Move.PAPER
                || playerOneMove == Move.PAPER && playerTwoMove == Move.ROCK) {

                playerOneGames += 1
            } else {
                playerTwoGames += 1
            }
        }
    }

    return if (playerOneGames == playerTwoGames) {
        "Tie"
    } else if (playerOneGames > playerTwoGames) {
        "Player 1"
    } else {
        "Player 2"
    }
}