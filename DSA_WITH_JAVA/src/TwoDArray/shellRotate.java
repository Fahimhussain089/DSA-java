package TwoDArray;

import java.util.Scanner;

public class shellRotate {
    public static void main(String[] args) {
        System.out.println("Enter the Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the S/ and Rotate ");

        int s = sc.nextInt();
        int r = sc.nextInt();
        rotateShee(arr, s, r);
        display(arr);


    }

    public static void rotateShee(int[][] arr, int s, int r) {
        int[] oned = fillOneFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }


    private static void rotate(int[] oned, int r) {
        r = r % oned.length;
        if (r < 0) {
            r = r + oned.length;//-1+5 = 4
        }
        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);
    }

    public static void reverse(int[] arr, int li, int ri) {
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }

    }

    private static void fillShellFromOned(int[][] arr, int s, int[] oned) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        //lw
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        //bw
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        //rw
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = oned[idx];
            idx++;
        }
        //tw
//        for (int i = minr, j = maxc - 1; j >= minc; j--)
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--){
            arr[i][j] = oned[idx];
            idx++;
        }
        return;

    }

    public static int[] fillOneFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int sz = 2 * (maxr - minr + maxc - minc); //one catcher for watch the video https://www.youtube.com/watch?v=atMK9aA-s7Y&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=14
        int[] oned = new int[sz];
        //lw
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        //bw
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        //rw
        for (int i = maxr - 1, j = maxc; i >= minr; i--){
            oned[idx] = arr[i][j];
            idx++;
        }
        //tw
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        return  oned;
    }
    private static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i ++){
            for (int j  = 0 ; j < arr[0].length; j++){
                System.out.println(arr[i][j]+ " ");
            }
        }
        System.out.println("");
    }
}

/*

4*4

11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44

sell : 2  roate 1

11 12 13 14
21 23 33 24
31 22 32 34
41 42 43 44


 */