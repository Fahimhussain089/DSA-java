package recursion;

import java.util.ArrayList;

public class subArrayString {
    public static void main(String[] args){
        System.out.println(subStrin("" , "abc"));

    }
    public static ArrayList<String> subStrin(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subStrin(p + ch, up.substring(1));
        ArrayList<String> right  = subStrin(p, up.substring(1));

         left.addAll(right);
         return left;



    }
}
