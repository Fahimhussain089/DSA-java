package TwoDArray;

import java.util.Scanner;

public class ExitPoint {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i  =0 ;  i <arr.length; i++){
            for (int j=0  ; j<  arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int i = 0;
        int j = 0 ;
        int dir = 0;
        // e = i, j++    // col inure
        // s = i++ , j   // row inure
        // w = i ,   j-- // col decree
        // n = i-- , j   // COL DECREE

        while (true){
             dir = ( dir + arr [i] [j] ) % 4;
             if (dir == 0){//GO TO EAST
                 j++;
             } else if (dir == 1) { // GO TO SOUTH
                  i++;
             }else if (dir ==2){   //GO TO WEST
                 j--;
             } else if (dir == 3) { // GO TO NORTH
                 i--;
             }

             if (i < 0){
                 i++;
                 break;
             } else if (j<0 ) {
                 j++;
                 break;
             } else if (i  == arr.length) {
                 i--;
                 break;
             } else if (j == arr[0].length) {
                 j--;
                 break;
             }

        }
        System.out.println(i);
        System.out.println(j);

    }
}
