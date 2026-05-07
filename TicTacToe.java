static boolean isValidMove(int row, int col) {

   
    if (row < 0 || row > 2 || col < 0 || col > 2) {
        return false;
    }


    if (board[row][col] != ' ') {
        return false;
    }

    return true; 
}
