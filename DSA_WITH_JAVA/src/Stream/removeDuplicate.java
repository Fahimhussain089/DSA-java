package Stream;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        String s =  "abcdefabcdef";
//        s.chars().distinct().mapToObj(x-> (char)x).forEach(System.out::print);
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);

    }
}
//out put is the
//  abcdefabcdef ==>     abcdef
