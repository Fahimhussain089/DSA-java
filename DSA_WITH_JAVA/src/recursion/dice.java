package recursion;

public class dice {
    public static void main(String[] args) {
        dic("",4);

    }
    public static void dic(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1 ; i <= 6 && i <= target ; i ++ ){
             dic( p + i , target -i);

        }


    }
}
