package TwoDArray;

import java.util.Scanner;

public class wavetravel {
    public static void main(String[] args) {
        System.out.println("enter the first array value: ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];

        for (int i =0 ; i <  arr.length; i++){
            for (int j =0  ; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j =0 ; j< arr[0].length; j++){
            if (j % 2 ==  0){
                for (int i =0 ; i < arr.length; i ++){
                    System.out.println(arr[i][j] );

                }

            }else {
                for (int i = arr.length - 1 ; i >= 0 ; i-- ){
                    System.out.println( "" );
                }

            }

        }


    }
}
