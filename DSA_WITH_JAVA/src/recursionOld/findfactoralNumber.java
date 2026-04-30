package recursionOld;

import java.util.ArrayList;

public class findfactoralNumber {
    static int sum = 0;
    static ArrayList<Integer> list = new ArrayList();

    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int reminder = n % 10;
        sum = sum * 10 + reminder;
        findfactoralNumber.reverse1(n / 10);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 4, 8, 10, 12};
        System.out.println(findfactoralNumber.findele(arr, 4, 0));
        System.out.println(findfactoralNumber.findEle(arr, 4, arr.length - 1));
        findfactoralNumber.FindAllEle(arr, 4, 0);
        System.out.println(list);
        System.out.println(findfactoralNumber.FindAllEle2(arr, 4, 0, new ArrayList<Integer>()));
    }

    static void factoal(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 1;
        while ((double)i <= Math.sqrt(n)) {
            if (n % i == 0 && n / i != i) {
                System.out.print(i + " ");
                list.add(n / i);
            }
            System.out.print("");
            ++i;
        }
        for (i = list.size() - 1; i >= 0; --i) {
            System.out.print(list.get(i) + " ");
        }
    }

    static int reverse3(int n) {
        int digits = (int)(Math.log10(n) + 1.0);
        return findfactoralNumber.helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10.0, digits - 1) + findfactoralNumber.helper(n / 10, digits - 1);
    }

    static boolean palim(int n) {
        return n == findfactoralNumber.reverse3(n);
    }

    static int findZero(int n) {
        return findfactoralNumber.helper2(n, 0);
    }

    private static int helper2(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            findfactoralNumber.helper2(n / 10, c++);
        }
        return findfactoralNumber.helper2(n / 10, c);
    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && findfactoralNumber.sorted(arr, index + 1);
    }

    static boolean findele(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] < arr[index + 1] || findfactoralNumber.findele(arr, target, index + 1);
    }

    static int findEle(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findfactoralNumber.findEle(arr, index, target - 1);
    }

    static int FindAllEle(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findfactoralNumber.FindAllEle(arr, target, index + 1);
    }

    static ArrayList<Integer> FindAllEle2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findfactoralNumber.FindAllEle2(arr, target, index + 1, list);
    }
}
