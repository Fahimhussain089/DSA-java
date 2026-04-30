package patterns;

public class square_pattern {
    public static void main(String[] args) {
        square_pattern.pattern8(4);
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }

    static void patter4(int n) {
        int numberofrow = n * 2;
        for (int row = 1; row <= numberofrow; ++row) {
            int numOfSpace = row > n ? numberofrow - row : row;
            for (int col = 1; col < numOfSpace; ++col) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patter5(int n) {
        for (int raw = 1; raw < 2 * n; ++raw) {
            int totalColinRow = raw > n ? 2 * n - raw : raw;
            int noofSpace = n - totalColinRow;
            for (int s = 0; s < noofSpace; ++s) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColinRow; ++col) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; ++row) {
            int col;
            for (int s = 0; s < n - row; ++s) {
                System.out.print(" ");
            }
            for (col = row; col >= 1; --col) {
                System.out.print(col);
            }
            for (col = 2; col <= row; ++col) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= 2 * n; ++row) {
            int col;
            int c = row > n ? 2 * n - row : row;
            for (int s = 0; s < n - row; ++s) {
                System.out.print("  ");
            }
            for (col = c; col >= 1; --col) {
                System.out.print(col + " ");
            }
            for (col = 2; col <= c; ++col) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; ++row) {
            for (int col = 0; col <= n; ++col) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
