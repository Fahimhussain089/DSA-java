package leetcode;

import java.util.HashMap;
import java.util.Iterator;

public class newquestion {
    public static void main(String[] args) {
        String s = "annabelle";
        int k = 2;
        boolean ans = newquestion.canConstruct(s, k);
        System.out.println(ans);
    }

    public static boolean canConstruct(String s, int k) {
        int n = s.length();
        if (k > n) {
            return false;
        }
        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            freqMap.put(Character.valueOf(c), freqMap.getOrDefault(Character.valueOf(c), 0) + 1);
        }
        int oddCount = 0;
        Iterator iterator = freqMap.values().iterator();
        while (iterator.hasNext()) {
            int count = (Integer)iterator.next();
            if (count % 2 == 0) continue;
            ++oddCount;
        }
        return oddCount <= k;
    }
}
