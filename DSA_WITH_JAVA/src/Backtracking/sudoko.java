package Backtracking;

import java.util.Scanner;

public class sudoko {
    public static void main(String[] args) {
        System.out.println("Enter the soduko:");

        Scanner scn  = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int  i =  0 ; i < 9; i++){
            for (int j = 0; j< 9 ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        solveSudoku(arr, 0,0);
    }

    private static void solveSudoku(int[][] board, int i, int j) {
        if (i ==  board.length){
           display(board);
           return;
        }
        int ni = 0;
        int nj = 0;
        if (j == board[0].length-1){ //board[0].length = 9 , then 9-1 ; 8 // 0 == 8
            ni = i+1;
            nj = 0;

        }else { //(0,0) → (0,1) → (0,2) → ... → (0,8)
            ni = i;
            nj = j+1;
        }
        if (board[i][j] != 0){
            solveSudoku(board,ni,nj);
        } else {
            for (int po = 1; po <= 9; po ++){//possible optioin
                if (isValid( board , i , j , po ) == true){
                    board[i][j] = po;
                    solveSudoku(board,ni,nj);
                    board[i][j] = 0;
                }
            }

        }
    }
    public static boolean isValid(int[][] board, int x, int y , int val){

        // this is for the ROW
        for (int j = 0  ; j <  board[0].length; j++){
            if (board[x][j] == val){
                return false;
            }
        }

        //this for the column
        for (int i = 0 ; i < board.length; i++){
            if (board[i][y] == val) {
                return false;
            }
        }
        int smi = x / 3 * 3 ;  //submatric   2/3 = 0//jab tk value base se kam hogi jab tk 0 ayega. jab cutna start hoga. jab uska cut value
        int smj = y / 3 * 3 ;  //submatric// 7/3 = 2
        for (int i =0  ;  i < 3; i ++){
            for (int j = 0  ; j <  3 ; j++){
                if ( board [ smi + i ] [ smj + j ] == val ) {
                    return false;
                }
            }
        }
        return true ;
    }
    public static void display(int [][] board){
        for (int i  =0  ; i <  board.length; i++){
            for (int j  =0 ; j <  board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/*

+-------+-------+-------+
| 5 3 0 | 0 7 0 | 0 0 0 |
| 6 0 0 | 1 9 5 | 0 0 0 |
| 0 9 8 | 0 0 0 | 0 6 0 |
+-------+-------+-------+
| 8 0 0 | 0 6 0 | 0 0 3 |
| 4 0 0 | 8 0 3 | 0 0 1 |
| 7 0 0 | 0 2 0 | 0 0 6 |
+-------+-------+-------+
| 0 6 0 | 0 0 0 | 2 8 0 |
| 0 0 0 | 4 1 9 | 0 0 5 |
| 0 0 0 | 0 8 0 | 0 7 9 |
+-------+-------+-------+


    5 3 0 0 7 0 0 0 0
    6 0 0 1 9 5 0 0 0
    0 9 8 0 0 0 0 6 0
    8 0 0 0 6 0 0 0 3
    4 0 0 8 0 3 0 0 1
    7 0 0 0 2 0 0 0 6
    0 6 0 0 0 0 2 8 0
    0 0 0 4 1 9 0 0 5
    0 0 0 0 8 0 0 7 9


    5 3 4 6 7 8 9 1 2
    6 7 2 1 9 5 3 4 8
    1 9 8 3 4 2 5 6 7
    8 5 9 7 6 1 4 2 3
    4 2 6 8 5 3 7 9 1
    7 1 3 9 2 4 8 5 6
    9 6 1 5 3 7 2 8 4
    2 8 7 4 1 9 6 3 5
    3 4 5 2 8 6 1 7 9




* */

