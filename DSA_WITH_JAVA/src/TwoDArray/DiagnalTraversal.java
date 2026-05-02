package TwoDArray;

import java.util.Scanner;

public class DiagnalTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array:");
        int n =sc.nextInt();
        int [][]  arr =  new int[n][n];
        for (int i  =0 ; i <arr.length; i ++){
            for (int j  =0  ; j <arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int g = 0 ; g < arr.length ; g ++){
            for (int j = g, i = 0 ; j < arr.length ; i++,j ++){
                System.out.println(arr[i][j]);

            }
        }
    }
}
/*
enter the array size :
2

11 12
21 22
output :=>
11
22
12




 */
