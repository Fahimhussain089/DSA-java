package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class combinationString {
    public static  void main(String[]  args){
      //  combiString("", "abc");
        //System.out.println(combiString("","abc"));
        ArrayList<String>  anslist  = combinationString("","abc");
        System.out.println(anslist);


    }
     static void  combiString(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch = up.charAt(0);
        for (int  i = 0 ; i <=  p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            combiString(f + ch + s , up.substring(1));
        }

     }
     public static ArrayList<String>  combinationString(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
         ArrayList<String> ans = new ArrayList<>();
        for (int i =0  ; i <= p.length(); i++){ //every step p ki leng 0/2/3/// if configuse see the diagram
            String f =  p.substring(0, i);
            String s = p.substring(i,p.length());

            ans.addAll(combinationString(f + ch + s , up.substring(1)));

        }
        return  ans;

     }
}
