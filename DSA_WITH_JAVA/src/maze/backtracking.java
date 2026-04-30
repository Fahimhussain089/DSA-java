package maze;

import java.util.ArrayList;

public class backtracking {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        System.out.println();
        pathcount("",3,3);
        System.out.println(pathRet("",3,3));
        System.out.println(pathDiag("",3,3));

    }
    public  static int count (int r, int c){

        if (r ==1 || c == 1){
            return 1;
        }
        int left  = count(r-1, c);
        int right  =  count (r , c-1);
        return left + right ;

    }
    public static void pathcount(String p, int r , int c){
        if (r==1 &&  c ==1 ){
            System.out.println(p);
        }
        if (r> 1){
            pathcount(p + 'R' , r-1,c);
        }
        if (c > 1){
            pathcount(p+ 'D' , r , c-1 );
        }
    }
    public static ArrayList<String> pathRet(String p, int r , int c){
        if (r==1 &&  c ==1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r> 1){

            ans.addAll(  pathRet(p + 'R' , r-1,c));
        }
        if (c > 1){
            ans.addAll(pathRet(p+'D', r,c-1));
        }
        return  ans;
    }
    public static ArrayList<String> pathDiag(String p, int r , int c){
        if (r==1 && c ==1){
            ArrayList<String>  list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String>  ans  =  new ArrayList<>();
        if (r > 1  &&  c > 1 ){
            ans.addAll( pathDiag(p+'D',r-1, c-1));
        }
        if (r> 1){
            ans.addAll(pathDiag(p+'V',r-1,c));
        }
        if (c>1){
            ans.addAll(pathDiag(p+'H',r,c-1));
        }
        return ans;

    }
}
