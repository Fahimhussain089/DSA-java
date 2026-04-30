package patterns;

import java.util.Scanner;

public class patter_webkul {
    public static void main(String[] args) {
        int j;
        int i;
        System.out.print("Please Enter the number :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 0; i < n / 2 + 1; ++i) {
            for (j = 0; j < n + n / 2 - i; ++j) {
                System.out.print("-");
            }
            for (j = 0; j < 2 * i + 1; ++j) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i = 0; i < n / 2 + 1; ++i) {
            for (j = 0; j < n; ++j) {
                System.out.print("_");
            }
            for (j = 0; j < 1; ++j) {
                System.out.print("@");
            }
            for (j = 0; j < n / 2 + 1; ++j) {
                System.out.print("_");
            }
            for (j = 0; j < 1; ++j) {
                System.out.print("@");
            }
            System.out.println("");
        }
        for (i = 0; i < n / 2 + 1; ++i) {
            for (j = 0; j < i; ++j) {
                System.out.print("-");
            }
            for (j = 0; j < n - 2 * i; ++j) {
                System.out.print("*");
            }
            if (i == 0) {
                System.out.print("@");
                for (j = 0; j < n / 2 + 1; ++j) {
                    System.out.print("-");
                }
                System.out.print("@");
                for (j = 0; j < n - 2 * i; ++j) {
                    System.out.print("*");
                }
            } else {
                if (i == 1) {
                    for (j = 0; j < n + i + 1; ++j) {
                        System.out.print("-");
                    }
                    for (j = 0; j < n - 2 * i; ++j) {
                        System.out.print("*");
                    }
                }
                if (i == 2) {
                    for (j = 0; j < 2 * n - i + 1; ++j) {
                        System.out.print("-");
                    }
                    for (j = 0; j < n - 2 * i; ++j) {
                        System.out.print("#");
                    }
                }
            }
            System.out.println("");
        }
    }
}
