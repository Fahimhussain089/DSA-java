package sorting;

import java.util.Arrays;

public class bubbleshort {
    public static void main(String[] args) {
        int[] arr = new int[]{0};
        bubbleshort.bubbleshort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleshort(int[] arr) {
        boolean shortedArrray = false;
        for (int i = 0; i < arr.length; ++i) {
            shortedArrray = true;
            for (int j = 1; j < arr.length - 1; ++j) {
                if (arr[j] >= arr[j - 1]) continue;
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                shortedArrray = true;
            }
            if (!shortedArrray) break;
        }
    }
}
