package revisionRecursion;

import java.util.ArrayList;

public class revison {
    static ArrayList<Integer> list = new ArrayList();

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 8, 9, 12};
        revison.findsorted(arr, 0);
        System.out.println(revison.findsorted(arr, 0));
        int[] arr1 = new int[]{3, 2, 1, 18, 9};
        int fundindex = revison.findindex(arr1, 0, 18);
        System.out.println(fundindex);
        int[] arr2 = new int[]{3, 2, 1, 18, 9};
        boolean fundele = revison.findele(arr2, 0, 19);
        System.out.println(fundele);
        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 7};
        revison.foundelementwithArraylist(arr3, 0, 7);
        System.out.println(list);
        int[] arr4 = new int[]{5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(revison.unsortedarray(arr4, 8, 0, arr4.length - 1));
    }

    static boolean findsorted(int[] arr, int index) {
        if (index < arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && revison.findsorted(arr, index + 1);
    }

    static int findindex(int[] arr1, int index, int target) {
        if (index == arr1.length) {
            return -1;
        }
        if (arr1[index] == target) {
            return index;
        }
        return revison.findindex(arr1, index + 1, target);
    }

    static boolean findele(int[] arr1, int index, int target) {
        if (index == arr1.length) {
            return false;
        }
        return arr1[index] == target || revison.findele(arr1, index + 1, target);
    }

    static void foundelementwithArraylist(int[] arr, int index, int target) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        revison.foundelementwithArraylist(arr, index + 1, target);
    }

    static int unsortedarray(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target < arr[mid]) {
                return revison.unsortedarray(arr, target, s, mid - 1);
            }
            return revison.unsortedarray(arr, target, mid + 1, e);
        }
        if (target >= arr[mid] && target <= arr[e]) {
            return revison.unsortedarray(arr, target, mid + 1, e);
        }
        return revison.unsortedarray(arr, target, s, mid - 1);
    }
}
