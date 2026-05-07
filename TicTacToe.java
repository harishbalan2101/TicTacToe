
import java.util.*;

public class TicTacToe{

    public static void main(String[] args) {

        Random rand = new Random();

        int toss = rand.nextInt(2); // 0 or 1

        char player1Symbol, player2Symbol;
        String currentPlayer;

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = "Player 1";
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = "Player 2";
        }

        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("First Turn: " + currentPlayer);
    }
}


    
