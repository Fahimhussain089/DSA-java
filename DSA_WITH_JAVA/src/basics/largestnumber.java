package basics;

import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Please selcte the operator:");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Please Enter the number ");
                int number1 = sc.nextInt();
                int number2 = sc.nextInt();
                if (op == '+') {
                    ans = number1 + number2;
                }
                if (op == '-') {
                    ans = number1 - number2;
                }
                if (op == '*') {
                    ans = number1 * number2;
                }
                if (op != '/') continue;
                ans = number1 / number2;
                continue;
            }
            if (op == 'x' || op == 'y') break;
            System.out.println("invalid operator selected");
        }
        System.out.println(ans);
    }
}
