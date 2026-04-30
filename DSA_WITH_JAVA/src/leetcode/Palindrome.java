package leetcode;

import java.util.HashMap;
import java.util.Iterator;

public class Palindrome {
    public static void main(String[] args) {
    }

    public static boolean palin(String n) {
        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        for (char c : n.toCharArray()) {
            freqMap.put(Character.valueOf(c), freqMap.getOrDefault(Character.valueOf(c), 0) + 1);
        }
        int oddCount = 0;
        Iterator iterator = freqMap.values().iterator();
        while (iterator.hasNext()) {
            int count = (Integer)iterator.next();
            if (count % 2 == 0) continue;
            ++oddCount;
        }
        return true;
    }
}
