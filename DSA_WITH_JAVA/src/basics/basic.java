package basics;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the digit");
        int In = in.nextInt();
        for (int i = 1; i < In; ++i) {
            System.out.print(i + " ");
        }
    }
}
