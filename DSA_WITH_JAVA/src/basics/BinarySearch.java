package basics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 13, 14, 15, 16, 19, 20, 22, 24, 26};
        int foundindex = BinarySearch.binarySearch(arr, 13);
        System.out.println(foundindex);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
                continue;
            }
            if (arr[mid] > target) {
                end = mid - 1;
                continue;
            }
            return mid;
        }
        return -1;
    }
}
