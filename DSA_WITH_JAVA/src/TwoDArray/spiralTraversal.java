package TwoDArray;

import java.util.Scanner;

public class spiralTraversal {
public static void main(String[] args) {

    Scanner sc  =  new Scanner(System.in);
    int r = sc.nextInt();
    int c =  sc.nextInt();
    int[][]  arr =  new int[r][c];
    for (int i =0 ; i < r; i ++){
        for (int j =0  ; j< c; j++){
            arr[i][j]  = sc.nextInt();
        }
    }
     int minr = 0 ;
     int minc = 0;
     int maxr = arr.length - 1;
     int maxc = arr[0].length-1;
     int tne =  r * c;
     int count =  0 ;
     while (count < tne ){
         //r =i c =j
         for (int i =  minr, j = minc ; i <= maxr && count < tne   ; i++){
             System.out.println(arr[i][j]);
             count++;
         }
         minc++;
         for (int i = maxr , j = minc ; j <= maxc && count < tne  ; j++){
             System.out.println(arr[i][j]);
             count++;
         }
         maxr--;

         for (int i = maxr , j = maxc ; i >= minr && count < tne  ; i -- ){  //minr 1// maxr 4 3 2 1 //count 28< 28
             System.out.println(arr[i][j]); //maxc 2
             count++;//  //7
         }
         maxc--;
         for (int i = minr , j =  maxc ; j >= minc && count < tne ; j--){
             System.out.println(arr[i][j]);
             count++;
         }
         minr++;

     }
}
}
