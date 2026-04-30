package patterns;

public class pattern_ILU {
    public static void main(String[] args) {
        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 20; ++j) {
                if (i == 0 && j < 5 || i == 6 && j < 5 || j == 2 || i == 6 && j > 6 && j < 12 || j == 7 || j == 14 || j == 19 || i == 6 && j > 13) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println("  ");
        }
    }
}
