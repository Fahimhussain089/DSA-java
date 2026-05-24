package Stream;

import java.util.Arrays;
import java.util.Comparator;

public class mxString {
    public static void main(String[] args) {
        String  s = "I am Learning Stream API from Youtube";
        String ans = Arrays.stream(s.split(" "))
                    .max(Comparator.comparing(String::length)).get();
        System.out.println(ans);
    }
}
//======oout put is the :
//      Learning
