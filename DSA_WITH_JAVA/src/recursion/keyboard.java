package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class keyboard {
    public static void main(String[] args) {
        System.out.println();
//        pad("" , "12");
//        padArr("" ,"12");
        System.out.println(padArr("" , "12"));
        System.out.println(padcount("" , "12"));

    }
    public static void pad(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;

        }
        int digit = up.charAt(0) - '0';
        for ( int i = (digit -1)*3 ; i <  digit *  3  ;  i ++){//sea the grap to celar understanding
            char ch = (char)  ('a' + i ) ;
            pad(p + ch , up.substring(1) );
        }
    }

    public static ArrayList<String> padArr(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list =  new ArrayList<>();
            System.out.println(p);
            list.add(p);

            return list;

        }
        int digit = up.charAt(0) - '0';
        ArrayList<String > ans = new ArrayList<>();
        for ( int i = (digit -1)*3 ; i <  digit *  3  ;  i ++){//sea the grap to celar understanding

            char ch = (char)  ('a' + i ) ;
            pad(p + ch , up.substring(1) );
            ans.addAll(padArr(p+ch,up.substring(1)));
        }
        return ans;
    }
    public  static int  padcount(String p , String up){
        if (up.isEmpty()){
            return 1;

        }
        int digit = up.charAt(0) - '0';
        int count  = 0 ;
        for (int i  = (digit-1)*3  ; i < digit * 3  ;  i ++ ){
            char ch = (char) ('a' + 1 );
            count  = count  +  padcount(p+ch , up.substring(1));
        }
        return count;
    }
}
