package strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringQuestion {
    public static void main(String[] args) {
        StringQuestion.stringshort("", "fahimHussain");
        System.out.println("second Ways:: " + StringQuestion.stringshortway2("gfabbcd"));
        System.out.println("before :: gsdsabcgfds third ways afer:: " + StringQuestion.stringShortway3("gsdsabcgfds"));
        System.out.println("before :: tfpabcgf        afer  fourth ways :: " + StringQuestion.stringShortway4("tfpabcgf"));
        System.out.println(" before String :: abc   ");
        StringQuestion.stringshortway5(" ", "abc");
        System.out.println("before String:: abc  After String :: " + StringQuestion.stringshortway6("", "abc"));
        int[] arr = new int[]{7, 8, 9};
        List<List<Integer>> list = StringQuestion.stringshortway7(arr);
        for (List<Integer> ans : list) {
            System.out.println("final list prepared:: " + ans);
        }
    }

    static void stringshort(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'H') {
            StringQuestion.stringshort(p, up.substring(1));
        } else {
            StringQuestion.stringshort(p + ch, up.substring(1));
        }
    }

    static String stringshortway2(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return StringQuestion.stringshortway2(up.substring(1));
        }
        return ch + StringQuestion.stringshortway2(up.substring(1));
    }

    static String stringShortway3(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if (up.startsWith("abc")) {
            return StringQuestion.stringShortway3(up.substring(3));
        }
        return up.charAt(0) + StringQuestion.stringShortway3(up.substring(1));
    }

    static String stringShortway4(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if (up.startsWith("ab") && !up.startsWith("abc")) {
            return StringQuestion.stringShortway3(up.substring(3));
        }
        return up.charAt(0) + StringQuestion.stringShortway3(up.substring(1));
    }

    static void stringshortway5(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        StringQuestion.stringshortway5(p + ch, up.substring(1));
        StringQuestion.stringshortway5(p, up.substring(1));
    }

    static ArrayList<String> stringshortway6(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = StringQuestion.stringshortway6(p + ch, up.substring(1));
        ArrayList<String> right = StringQuestion.stringshortway6(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static List<List<Integer>> stringshortway7(int[] arr) {
        ArrayList<List<Integer>> outer = new ArrayList<List<Integer>>();
        outer.add(new ArrayList());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; ++i) {
                ArrayList<Integer> inner = new ArrayList<Integer>((Collection)outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
