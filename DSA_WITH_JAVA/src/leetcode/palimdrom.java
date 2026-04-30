package leetcode;

public class palimdrom {
    public static int sum = 0;

    public static void main(String[] args) {
        int n = 12321;
        if (palimdrom.palim(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
        String name = "fahim";
        palimdrom.palim1(name);
        System.out.println(palimdrom.palim1(name));
    }

    public static boolean palim(int n) {
        return n == palimdrom.rev(n);
    }

    public static int rev(int n) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return palimdrom.rev(n / 10);
    }

    public static boolean palim1(String n) {
        return n.equals(palimdrom.rev2(n));
    }

    private static String rev2(String n) {
        if (n.isEmpty()) {
            return n;
        }
        return n.charAt(n.length() - 1) + palimdrom.rev2(n.substring(0, n.length() - 1));
    }
}
