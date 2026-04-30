package patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        int j;
        int i;
        System.out.println("Enter the Number:: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 0; i < 1; ++i) {
            for (j = 0; j < n - 1; ++j) {
                System.out.print("*");
            }
            for (j = 0; j < n; ++j) {
                System.out.print(" ");
            }
            for (j = 0; j < 1; ++j) {
                System.out.print("*");
            }
            System.out.println("");
            for (i = 0; i < n; ++i) {
                for (j = 0; j < n - 2; ++j) {
                    System.out.print(" ");
                }
                for (j = 0; j < 1; ++j) {
                    System.out.print("*");
                }
                for (j = 0; j < n; ++j) {
                    if (i == n / 2) {
                        for (j = 0; j < n; ++j) {
                            System.out.print("+");
                        }
                        continue;
                    }
                    System.out.print(" ");
                }
                for (j = 0; j < 1; ++j) {
                    System.out.print("*");
                }
                for (j = 0; j < n; ++j) {
                    if (i == n / 2) {
                        for (j = 0; j < n; ++j) {
                            System.out.print("*");
                        }
                        continue;
                    }
                    System.out.print(" ");
                }
                for (j = 0; j < 1; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (i = 0; i < 1; ++i) {
            for (j = 0; j < 2 * n - 1; ++j) {
                System.out.print(" ");
            }
            for (j = 0; j < 1; ++j) {
                System.out.print("*");
            }
            for (j = 0; j < n; ++j) {
                System.out.print(" ");
            }
            for (j = 0; j < n - 1; ++j) {
                System.out.print("*");
            }
        }
    }
}
