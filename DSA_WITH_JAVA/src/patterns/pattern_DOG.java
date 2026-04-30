package patterns;

public class pattern_DOG {
    public static void main(String[] args) {
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 18; ++j) {
                if (i == 0 && j < 2 || i == 5 && j < 2 || j == 0 || j == 2 && i > 0 && i < 5 || j == 6 && i > 0 && i < 5 || j == 10 && i > 0 && i < 5 || i == 0 && j > 6 && j < 10 || i == 5 && j > 6 && j < 10 || i == 0 && j > 13 && j < 17 || j == 13 || i == 3 && j > 14 && j < 18 || i == 5 && j > 13 && j < 16 || i == 4 && j > 14 && j < 16 || j == 17 && i > 3 && i < 6) {
                    System.out.print(" *");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
