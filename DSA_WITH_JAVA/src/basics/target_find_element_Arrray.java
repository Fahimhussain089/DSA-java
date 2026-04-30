package basics;

public class target_find_element_Arrray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 3, 4, 6, 7}, {9, 8, 3, 5, 95, 1}, {12, 14, 15, 89}};
        int target = 4;
        int ele = target_find_element_Arrray.findmaxeleArry(arr);
        System.out.println("Found element::" + ele);
    }

    static int findmaxeleArry(int[][] arr) {
        int min = Integer.MIN_VALUE;
        for (int raw = 0; raw < arr.length; ++raw) {
            for (int col = 0; col < arr[raw].length; ++col) {
                if (arr[raw][col] <= min) continue;
                min = arr[raw][col];
            }
        }
        return min;
    }
}
