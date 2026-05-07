import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random rand = new Random();
        boolean placed = false;

        while (!placed) {
            // Generate random slot between 1 and 9
            int slot = rand.nextInt(9) + 1;

            // Convert slot to 2D array indices
            // Row: (slot-1) / 3, Column: (slot-1) % 3
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Validation: Check if the slot is empty
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                placed = true;
                System.out.println("Computer chose slot: " + slot);
            }
        }
        displayBoard(); // Optional: to see the result
    }

    // Helper method to see the board state
    static void displayBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
