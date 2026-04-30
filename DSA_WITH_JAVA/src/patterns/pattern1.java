package patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        int j;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:: ");
        int n = sc.nextInt();
        for (i = 0; i <= n / 2 + 1; ++i) {
            for (j = 0; j < 2 * n - i; ++j) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n - 1; ++i) {
            for (j = 0; j < 2 * n - 1; ++j) {
                System.out.print(" ");
            }
            for (j = 0; j < 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < 1; ++i) {
            for (j = i; j < n; ++j) {
                System.out.print(" ");
            }
            for (j = i; j < n; ++j) {
                System.out.print("*");
            }
            System.out.println();
            for (j = 1; j <= n; ++j) {
                System.out.print(" ");
            }
            for (j = n; j <= n; ++j) {
                System.out.println("@");
            }
        }
        for (i = 0; i < n; ++i) {
            int space = n / 2 > i ? n / 2 - i : i - n / 2;
            for (j = 0; j < space; ++j) {
                System.out.print(".");
            }
            int numberofColum = n / 2 > i ? i + 1 : n - i;
            for (j = 0; j < numberofColum; ++j) {
                System.out.print("*");
            }
            for (j = 0; j < n / 2; ++j) {
                if (i == n / 2) {
                    System.out.print("- ");
                    continue;
                }
                System.out.print("+");
            }
            for (j = 0; j < 1; ++j) {
                if (i >= 2) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("F");
            }
            System.out.println();
        }
    }
}
