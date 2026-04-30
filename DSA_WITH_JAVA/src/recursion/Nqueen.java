package recursion;

public class Nqueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int solutions = queen(board, 0);
        System.out.println("Total solutions: " + solutions);
    }

    public static int queen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                count += queen(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        // Check vertical (above) in same column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check diagonal left (top-left)
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Check diagonal right (top-right)
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    public static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}


/*
        Step 1: Row 0
        Place queen at (0,0)

        text
        Q X X X
        X X X X
        X X X X
        X X X X
        Step 2: Row 1
        Try columns 0-2: all fail due to conflicts with (0,0)

        Column 3: issafe(1,3) = true ✓

        Place queen at (1,3)

        text
        Q X X X
        X X X Q
        X X X X
        X X X X
        Step 3: Row 2
        Column 0: issafe(2,0) = false (vertical conflict with (0,0))

        Column 1: issafe(2,1) = true ✓

        Place queen at (2,1)

        text
        Q X X X
        X X X Q
        X Q X X
        X X X X
        Step 4: Row 3
        Column 0: issafe(3,0) = false (vertical conflict with (0,0))

        Column 1: issafe(3,1) = false (vertical conflict with (2,1))

        Column 2: issafe(3,2) = false (diagonal conflict with (2,1) and (1,3))

        Column 3: issafe(3,3) = false (vertical conflict with (1,3))

        → All positions fail! Backtrack

        Step 5: Backtrack to Row 2
        Remove queen from (2,1)

        Try column 2: issafe(2,2) = false (diagonal conflict with (1,3))

        Try column 3: issafe(2,3) = false (vertical conflict with (1,3))

        → All positions fail! Backtrack

        Step 6: Backtrack to Row 1
        Remove queen from (1,3)

        No more columns left! Backtrack

        Step 7: Backtrack to Row 0
        Remove queen from (0,0)

        Try column 1: issafe(0,1) = true ✓

        Place queen at (0,1)

        text
        X Q X X
        X X X X
        X X X X
        X X X X
        Step 8: Continue... (This leads to first valid solution)
        FIRST VALID SOLUTION:

        text
        X Q X X
        X X X Q
        Q X X X
        X X Q X
        The algorithm continues like this, exploring all possibilities through systematic backtracking until it finds all 2 solutions for the 4-queens problem.

        Final Output:

        text
        X Q X X
        X X X Q
        Q X X X
        X X Q X

        X X Q X
        Q X X X
        X X X Q
        X Q X X

        Total solutions: 2








 */