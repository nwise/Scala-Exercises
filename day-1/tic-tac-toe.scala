class TicTacToeCalculator() {

    def find_winner(board: List[(String, String, String)]): String = {
        var winner = new String("tie")
        var players = List("x", "o")
        display_game(board)
        for(i <- 0 until 2 ){
            winner = find_vert_win(board, players(i), winner)
            winner = find_horiz_win(board, players(i), winner)
            winner = find_diag_win(board, players(i), winner)
        }
        winner = game_in_progress(board, winner)
        return winner
    }

    def game_in_progress(board: List[(String, String, String)], current_winner: String): String = {
        var winner = new String(current_winner)
        board.foreach{ row =>
            val (a, b, c) = row
            if( a == "" || b == "" || c == "" ){
                winner = "unfinished"
            }
        }
        return winner
    }

    def find_vert_win(board: List[(String, String, String)], symbol: String, current_winner: String): String = {
        if (board(0)._1 == symbol && board(1)._1 == symbol && board(2)._1 == symbol) symbol
        if (board(0)._2 == symbol && board(1)._2 == symbol && board(2)._2 == symbol) symbol
        if (board(0)._3 == symbol && board(1)._3 == symbol && board(2)._3 == symbol) symbol
        else current_winner
    }

    def find_horiz_win(board: List[(String, String, String)], symbol: String, current_winner: String): String = {
        if(board(0) == (symbol, symbol, symbol)) symbol
        if(board(1) == (symbol, symbol, symbol)) symbol
        if(board(2) == (symbol, symbol, symbol)) symbol
        else current_winner
    }

    def find_diag_win(board: List[(String, String, String)], symbol: String, current_winner: String): String = {
        if( board(0)._1 == symbol && board(1)._2 == symbol && board(2)._3 == symbol ) symbol
        if( board(0)._3 == symbol && board(1)._2 == symbol && board(2)._1 == symbol ) symbol
        else current_winner
    }

    def display_game(board: List[(String, String, String)]): Unit = {
        println("Board:")
        println("+-+-+-+")
        board.foreach{ row =>
          println("|" + row._1 + "|" + row._2 + "|" + row._3 + "|")
          println("+-+-+-+")
        }
    }
}

var t3_calc = new TicTacToeCalculator

var t3_board = List( ("x", "o", "o"), ("x", "o", "x"), ("o", "o", "x") )
println("\nWinner is: " + t3_calc.find_winner(t3_board))

