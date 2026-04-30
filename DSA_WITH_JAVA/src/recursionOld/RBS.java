package recursionOld;

public class RBS {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(RBS.findRBS(arr, 9, 0, arr.length - 1));
    }

    static int findRBS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return RBS.findRBS(arr, target, s, mid - 1);
            }
            return RBS.findRBS(arr, target, mid + 1, e);
        }
        if (target >= arr[mid] && target <= arr[e]) {
            return RBS.findRBS(arr, target, mid + 1, e);
        }
        return RBS.findRBS(arr, target, s, mid - 1);
    }
}
