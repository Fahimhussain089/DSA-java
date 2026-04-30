package recursion;



public class Knight {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 3);
    }

    public static void knight(boolean[][] board, int row, int col, int knight) {
        // Correct base case: all knights placed
        if (knight == 0) {
            display(board);
            System.out.println();
            return;
        }

        // If we reached end of board → stop
        if (row == board.length) {
            return;
        }

        // If col ends → move to next row
        if (col == board.length) {
            knight(board, row + 1, 0, knight);
            return;
        }

        // Try placing knight
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knight - 1);
            board[row][col] = false; // backtrack
        }

        // Skip placing knight
        knight(board, row, col + 1, knight);
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {

        // (-2, -1)
        if (isValid(board, row - 2, col - 1)
                && board[row - 2][col - 1]) {
            return false;
        }

        // (-1, -2)
        if (isValid(board, row - 1, col - 2)
                && board[row - 1][col - 2]) {
            return false;
        }

        // (-2, +1)
        if (isValid(board, row - 2, col + 1)
                && board[row - 2][col + 1]) {
            return false;
        }

        //
        //    isValid(row-1, col+1) check & board[row-1][col+2] access
        // ✔️ Correct:
        if (isValid(board, row - 1, col + 2)
                && board[row - 1][col + 2]) {
            return false;
        }

        return true;
    }

    public static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0
                && row < board.length
                && col >= 0
                && col < board.length;
    }

    public static void display(boolean[][] board) {
        for (boolean[] r : board) {
            for (boolean cell : r) {
                System.out.print(cell ? "K " : "X ");
            }
            System.out.println();
        }
    }
}
