package recursion;

import java.util.Arrays;

public class stringsort {
    public static void main(String[] args){
        String up = "fahimhussain";
        filterString(" " , up );
        skipString(up);
        System.out.println("" + skipString(up));
       // System.out.println();




    }
    public  static void filterString( String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return ;

        }
        char r = up.charAt(0);
        if (r == 'a'){
            filterString(p , up.substring(1) );

        }else{
            filterString(p + r , up.substring(1));
        }
    }
    public static String skipString(String up){
        if (up.isEmpty()){
            return "";
        }


        if (up.startsWith("hussain")){
            return  skipString(up.substring(7));

        }else {
            return up.charAt(0) + skipString(up.substring(1));
        }

    }
}
