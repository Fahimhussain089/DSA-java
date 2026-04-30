package basics;

import java.util.Scanner;

public class passingFunaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number::");
        for (int i = 100; i < 1000; ++i) {
            if (!passingFunaction.getamstroim(i)) continue;
            System.out.print(i + " ");
        }
    }

    static boolean getamstroim(int number) {
        int ans = number;
        int sum = 0;
        while (number > 0) {
            int reminder = number % 10;
            int cube = reminder * reminder * reminder;
            sum += cube;
            number /= 10;
        }
        return ans == sum;
    }
}
