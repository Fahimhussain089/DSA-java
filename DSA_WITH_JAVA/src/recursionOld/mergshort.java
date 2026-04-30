package recursionOld;

import java.util.Arrays;

public class mergshort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        int[] shortedArray = mergshort.mergeShort(arr);
        System.out.println("shorted array :: " + Arrays.toString(shortedArray));
    }

    static int[] mergeShort(int[] arr) {
        if (arr.length - 1 == 0) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergshort.mergeShort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergshort.mergeShort(Arrays.copyOfRange(arr, mid, arr.length));
        return mergshort.merg(left, right);
    }

    private static int[] merg(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                ++i;
            } else {
                mix[k] = second[j];
                ++j;
            }
            ++k;
        }
        while (i < first.length) {
            mix[k] = first[i];
            ++i;
            ++k;
        }
        while (j < second.length) {
            mix[k] = second[j];
            ++j;
            ++k;
        }
        return mix;
    }
}
