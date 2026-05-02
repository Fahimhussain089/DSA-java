package TwoDArray;

import java.util.Scanner;

public class exitpoin {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i  =0 ;  i <arr.length; i++){
            for (int j=0  ; j<  arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int i = 0 ;
        int j = 0 ;
        int dir = 0;

        while (true){
            dir = (dir + arr[i][j])%4;

            if (dir == 0 ){//e
                j++;
            } else if (dir == 1) {//s
                i++;
            } else if (dir == 2 ) {//w
                j--;
            } else if (dir == 3 ) { // n
                i--;
            }
            if (i < 0 ){
                i++;
                break;
            }
            if (j < 0 ){
                j++;
                break;
            }
            if (i == arr.length){
                i--;
            }
            if (j == arr[0].length){
                j--;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
//==========================
/*
    0 0 1 0
    1 0 0 1
    0 0 0 1
    1 0 1 0

    outpu is
    2
    0




* */