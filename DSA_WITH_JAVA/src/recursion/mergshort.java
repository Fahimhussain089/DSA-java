package recursion;

import java.util.Arrays;

public class mergshort {
    public static void main(String[]  args){
        int[]  arr = {5,4,3,2,1};
        arr =  mergshort01(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static int []  mergshort01(int []  arr ){
        if (arr.length == 1){
            return arr;
        }
        int middle  =  arr.length/2;

        int[] left  =  mergshort01(Arrays.copyOfRange(arr,0, middle));
        int[] right  = mergshort01(Arrays.copyOfRange(arr,middle, arr.length));

        return merg( left, right);

    }
    public static  int[] merg(int[] first  , int[] second ){
        int[]  mix  = new int[first.length + second.length];
        int i = 0 ;
        int j = 0 ;
        int k = 0;
        while (i< first.length && j <  second.length ){
            if(first[i] < second[j]){
                mix[k] =first[i];
                i++;
                k++;


            }else {
                mix[k] = second[j];
                j++;
                k++;
            }

        }
        while (i  < first.length){
            mix[k] = first[i];
            i++;
            k++;

        }
        while (j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return  mix ;

    }
}
