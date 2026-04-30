package recursionOld;

import java.util.Arrays;

public class mergshort2 {
    public static void main(String[] args) {
        int[] arrr = new int[]{5, 4, 3, 2, 1};
        mergshort2.mergshortway(arrr, 0, arrr.length);
        System.out.println("shoted array : \n " + Arrays.toString(arrr));
    }

    static void mergshortway(int[] arrr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (e + s) / 2;
        mergshort2.mergshortway(arrr, s, mid);
        mergshort2.mergshortway(arrr, mid, e);
        mergshort2.mergshortplace(arrr, s, mid, e);
    }

    private static void mergshortplace(int[] arrr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e) {
            if (arrr[i] < arrr[j]) {
                mix[k] = arrr[i];
                ++i;
            } else {
                mix[k] = arrr[j];
                ++j;
            }
            ++k;
        }
        while (i < mid) {
            mix[k] = arrr[i];
            ++i;
            ++k;
        }
        while (j < e) {
            mix[k] = arrr[j];
            ++j;
            ++k;
        }
        for (int l = 0; l < mix.length; ++l) {
            arrr[s + l] = mix[l];
        }
    }
}
