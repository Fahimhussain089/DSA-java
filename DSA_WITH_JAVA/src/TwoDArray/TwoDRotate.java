package TwoDArray;

import java.util.Scanner;

public class TwoDRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][r];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //transform
        for (int i = 0 ; i < arr.length;i ++ ){
            for (int j = i; j < arr[0].length;  j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //rotate
        for (int i = 0 ; i < arr.length; i++){
            int li = 0;
            int ri = arr[i].length - 1;
            while (li< ri){
                int temp  = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;

            }
        }
        display(arr);

    }

    private static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i ++){
            for (int j  = 0 ; j < arr[0].length; j++){
                System.out.println(arr[i][j]+ "");
            }
        }
        System.out.println("");
    }


}

/*
4
4
1
2
3
4
10
20
30
40
11
12
13
14
21
22
23
24






* */