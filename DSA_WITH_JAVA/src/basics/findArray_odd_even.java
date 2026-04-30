package basics;

public class findArray_odd_even {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 145, 145, 1998};
        int ele = findArray_odd_even.foundinArray(arr);
        System.out.println("number of even digit::" + ele);
    }

    static int foundinArray(int[] arr) {
        int counts = 0;
        for (int nums : arr) {
            if (!findArray_odd_even.evennumber(nums)) continue;
            ++counts;
        }
        return counts;
    }

    static boolean evennumber(int num) {
        int reminder = 0;
        int count = 0;
        while (num > 0) {
            reminder = num % 10;
            ++count;
            num /= 10;
        }
        return false;
    }
}
