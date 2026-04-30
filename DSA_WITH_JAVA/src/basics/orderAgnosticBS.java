package basics;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, -1, 5, 6, 8, 10};
        int foundElement = orderAgnosticBS.orderAgnosticSearch(arr, 5);
        System.out.println("index is ::" + foundElement);
    }

    static int orderAgnosticSearch(int[] arr, int target) {
        boolean asAsc;
        int start = 0;
        int end = arr.length - 1;
        boolean bl = asAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (asAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                    continue;
                }
                start = mid + 1;
                continue;
            }
            if (arr[mid] < target) {
                end = mid - 1;
                continue;
            }
            start = mid + 1;
        }
        return -1;
    }
}
