package basics;

public class findmaxelementArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-7, 1, 2, 3, 4, 5, 6, 7, 8, 9, -10, 10};
        int foundelement = findmaxelementArray.findminarray(arr);
        System.out.println(foundelement);
    }

    static int findminarray(int[] arr) {
        int element = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] >= element) continue;
            element = arr[i];
        }
        return element;
    }
}
