package TwoDArray;

import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args){
        System.out.println("Enter the value here : ");
        Scanner sc  =  new Scanner(System.in);
               int n = sc.nextInt();
               int [][] arr = new int[n][n];
               for (int i  =0 ; i < arr.length; i ++){
                   for (int j =0 ; j < arr[0].length; j++){
                       arr[i][j] =  sc.nextInt();
                   }
               }
        for (int i = 0; i < arr.length; i++) {
            int minColIndex = 0;

            // find min in row
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][minColIndex]) {
                    minColIndex = j;
                }
            }

            // check max in column
            boolean isSaddle = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][minColIndex] > arr[i][minColIndex]) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println(arr[i][minColIndex]);
                return;
            }
        }

        System.out.println("No saddle point");

    }

}
