package recursionOld;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 1};
        bubble.selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleshort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble.bubbleshort(arr, r, c + 1);
        } else {
            bubble.bubbleshort(arr, r - 1, 0);
        }
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                bubble.selection(arr, r, c + 1, c);
            } else {
                bubble.selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            bubble.selection(arr, r - 1, 0, 0);
        }
    }
}
