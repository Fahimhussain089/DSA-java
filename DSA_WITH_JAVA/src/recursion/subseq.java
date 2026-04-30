package recursion;

public class subseq {
    public static void main(String[] args){
        String str = "abc";
//        System.out.println(stringsort("",str));
        strseq("","abc");


    }
    public static void strseq(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        strseq(p+ch,up.substring(1));
        strseq(p , up.substring(1));



    }
}
