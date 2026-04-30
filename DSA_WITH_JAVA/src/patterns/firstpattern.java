package patterns;

import java.util.Scanner;

public class firstpattern {
    public static void main(String[] args) {
        int j;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 0; i < n; ++i) {
            for (j = 0; j < i; ++j) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * (n - i) - 1; ++j) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (i = 0; i < n; ++i) {
            System.out.print("*");
        }
        System.out.println();
        for (i = 0; i < n - 1; ++i) {
            System.out.print("*");
            for (j = 0; j < n - 2; ++j) {
                System.out.print(" ");
            }
            if (n > 2) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
