package patterns;

public class patter_alphabate {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 18; ++j) {
                if (i == 0 && j < 4 || i == 4 && j < 4 || j == 0 && i < 8 || i == 0 && j > 4 && j < 9 || i == 4 && j > 4 && j < 9 || j == 5 && i < 4 || j == 8 && i < 4 || i == 0 && j > 9 && j < 12 || i == 4 && j > 9 && j < 12 || j == 10 && i < 4 || j == 12 && i > 0 && i < 4 || i == 0 && j > 14 && j < 17 || i == 2 && j > 14 && j < 17 || i == 4 && j > 14 && j < 17 || j == 14 && i > 0 && i < 4) {
                    System.out.print(" *");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
}
