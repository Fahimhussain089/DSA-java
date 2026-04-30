package patterns;

public class pattern5 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 25; ++j) {
                if (i == 0 && j < 3 || j == 0 || i == 4 && j < 3 || i == 8 && j < 3 || j == 3 && i > 0 && i < 4 || j == 3 && i > 4 && i < 8 || i == 0 && j > 6 && j < 10 || i == 8 && j > 6 && j < 10 || j == 6 && i > 0 && i < 8 || j == 10 && i > 0 && i < 8 || j == 13 && i > 0 && i < 4 || j == 17 && i > 4 && i < 8 || i == 0 && j > 13 && j < 17 || i == 8 && j > 13 && j < 17 || i == 4 && j > 13 && j < 17 || j == 20 && i > 0 && i < 4 || j == 24 && i > 4 && i < 8 || i == 0 && j > 20 && j < 24 || i == 8 && j > 20 && j < 24 || i == 4 && j > 20 && j < 24) {
                    System.out.print(" *");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
