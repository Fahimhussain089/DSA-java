package recursion;

public class isPrime {
    public static void main(String[] args) {
        int n = 50;
        boolean[] isPrime = new boolean[n + 1];
        foundPrime(n, isPrime);


        for (int i =  2  ; i <= n ; i++ ){
           // foudPrime(i);

            if (foudPrime(i)){
                System.out.println( i);
            }
        }
    }

    public static void foundPrime(int n, boolean[] isPrime) {
        for (int i  = 2 ; i <=  n ;  i++ ){
            isPrime[i] = true ;
        }
        for (int i = 2 ; i <= n ; i++ ){
            if (isPrime[i]){
                for (int j  = i * i ; j <=n ; j = j+i){
                    isPrime[j] = false;
                }
            }

        }

        for (int i =0  ; i <= n ; i ++){
            if (isPrime[i]){
                System.out.println(i + " prime  " );
            }

        }

    }
    public static boolean foudPrime (int n ){
        if (n <= 1) {
            return false;
        }
        int c  = 2 ;
        while ( c * c <= n){
            if (n % c == 0){
                return false;//4, 6 , 8, ye prime nai hai
            }
            c++ ;
        }
        return true;


    }
}