package Stream;

import java.util.Arrays;
import java.util.Comparator;

public class second_third_highest {
    public static void main(String[] args){
        String s = "I am Learning Stream API in java ";
        String ans = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();

        System.out.println(ans);

    }
}
//Sorted by length (descending):
//
//          Learning (8)   //agr find kren 2 not
//          Stream (6)     // agr find kren 2 not
//          java (4)       // ==> correct
//          API (3)
//          am (2)
//          in (2)
//          I (1)
