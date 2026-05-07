public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        
        
        while (!gameOver) {
            
            if (isHumanTurn) {
                humanMove();
            } else {
                computerMove();
            }

           
            if (checkWin() || checkDraw()) {
                gameOver = true;
                System.out.println("The game has ended!");
            } else {
                
                isHumanTurn = !isHumanTurn;
            }
        }
    }
}
