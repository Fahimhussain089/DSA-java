package recursionOld;

import java.util.Arrays;

public class quickShort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 9, 20, 12};
        quickShort.quickShortway(arr, 0, arr.length - 1);
        System.out.println("quick short:: " + Arrays.toString(arr));
    }

    static void quickShortway(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        while (s <= e) {
            while (arr[s] < pivot) {
                ++s;
            }
            while (arr[e] > pivot) {
                --e;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                ++s;
                --e;
            }
            quickShort.quickShortway(arr, low, e);
            quickShort.quickShortway(arr, s, hi);
        }
    }
}
