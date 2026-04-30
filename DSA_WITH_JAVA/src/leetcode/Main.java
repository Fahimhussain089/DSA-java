package leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[]{5, 1, 3, 4, 2};
        Main.secondlargestnumber(number);
        System.out.print("second largest number :: " + Arrays.toString(number));
    }

    public static void secondlargestnumber(int[] number) {
        int max = number[0];
        int mini = number[0];
        for (int second : number) {
            if (second <= max) continue;
            max = second;
        }
    }
}
