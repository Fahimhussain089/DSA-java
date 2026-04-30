package recursionOld;

import java.util.ArrayList;

public class diceThrow {
    public static void main(String[] args) {
        diceThrow.dicefind("", 4);
    }

    public static void pad(String p, String Up) {
        if (Up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = Up.charAt(0) + 48;
        for (int i = (digit - 1) * 3; i < digit * 3; ++i) {
            char ch = (char)(97 + i);
            diceThrow.pad(p + ch, Up.substring(1));
        }
    }

    static ArrayList<String> padReset(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - 48;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = (digit - 1) * 3; i < digit * 3; ++i) {
            char ch = (char)(97 + i);
            list.addAll(diceThrow.padReset(p + ch, up.substring(1)));
        }
        return list;
    }

    public static int padcount(String p, String Up) {
        if (Up.isEmpty()) {
            System.out.println(p);
            return 1;
        }
        int count = 0;
        int digit = Up.charAt(0) + 48;
        for (int i = (digit - 1) * 3; i < digit * 3; ++i) {
            char ch = (char)(97 + i);
            count += diceThrow.padcount(p + ch, Up.substring(1));
        }
        return count;
    }

    public static void dicefind(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; ++i) {
            diceThrow.dicefind(p + i, target - i);
        }
    }
}
