package recursion;

import java.util.Arrays;

public class bubleshot {
    public static void main(String[]  args){
        int[]  arr = {4,3,2,1};
        bubbleshot(arr,4,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void  bubbleshot(int[] arr, int r, int c){
        if (r == 0 ){return; }
        if (c < r){
            if (c < arr.length-1 &&
                    arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleshot(arr,r,c+1);

        }else {

            bubbleshot(arr,r-1,0);
        }


    }
}
