package patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        int numberofSpace;
        int j;
        int i;
        System.out.print("Enter the number:: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 0; i <= n / 2; ++i) {
            for (j = 0; j < n - i; ++j) {
                System.out.print("-");
            }
            for (j = 0; j < 2 * i + 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n / 2 + 1; ++j) {
                System.out.print(" ");
            }
            for (j = 0; j < 1; ++j) {
                System.out.print("*");
            }
            for (j = 0; j < n / 2 + 1; ++j) {
                System.out.print(" ");
            }
            for (j = 0; j < 1; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = 0; i < n; ++i) {
            numberofSpace = i < n / 2 ? n / 2 - i : i - n / 2;
            for (j = 0; j < numberofSpace; ++j) {
                System.out.print(" ");
            }
            int numberofColum = n / 2 > i ? i + 1 : n - i;
            for (j = 0; j < numberofColum; ++j) {
                System.out.print("*");
            }
            for (j = 0; j < n; ++j) {
                System.out.print(".");
            }
            int numberofColums = n / 2 > i ? i + 1 : n - i;
            for (j = 0; j < numberofColums; ++j) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i = 0; i < n; ++i) {
            numberofSpace = 0;
            for (j = 0; j < n - 1; ++j) {
                System.out.print(" ");
            }
            for (j = 0; j < n / 2 + 1; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
