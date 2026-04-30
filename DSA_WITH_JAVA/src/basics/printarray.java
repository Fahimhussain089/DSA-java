package basics;

import java.util.Scanner;

public class printarray {
    public static void main(String[] args) {
        int col;
        int raw;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array::");
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for (raw = 0; raw < arr.length; ++raw) {
            for (col = 0; col < arr[raw].length; ++col) {
                arr[raw][col] = sc.nextInt();
            }
        }
        for (raw = 0; raw < arr.length; ++raw) {
            for (col = 0; col < arr[raw].length; ++col) {
                System.out.print(arr[raw][col] + " ");
            }
        }
    }
}
