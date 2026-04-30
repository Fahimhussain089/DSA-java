package basics;

public class linearsearchwithrange {
    public static void main(String[] args) {
        int[] arr = new int[]{182, 12, 28, 34, 43, 43, 5, 2};
        int foundindex = linearsearchwithrange.linearsearch(arr, 132, 1, 5);
        System.out.println("found element is:: " + foundindex);
    }

    static int linearsearch(int[] arr, int target, int start, int end) {
        for (int index = start; index <= end; ++index) {
            int element = arr[index];
            if (element != target) continue;
            return index;
        }
        return -1;
    }
}
