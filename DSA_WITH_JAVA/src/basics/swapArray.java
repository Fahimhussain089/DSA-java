package basics;

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 23, 9, 19};
        swapArray.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        for (int end = arr.length - 1; start < end; ++start, --end) {
            swapArray.swap(arr, start, end);
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
