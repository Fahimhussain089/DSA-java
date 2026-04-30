package basics;

import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{2, 3, 4, 5, 6, 7}, {10, 9, 12, 13, 14, 15}, {20, 22, 24, 26, 28}};
        int[] foundele = searchin2Darray.search(matrix, 9);
        System.out.println(Arrays.toString(foundele));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c > 0) {
            int mid = r + (r - c) / 2;
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                ++r;
                continue;
            }
            --c;
        }
        return new int[]{-1, -1};
    }
}
