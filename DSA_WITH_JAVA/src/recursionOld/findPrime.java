package recursionOld;

public class findPrime {
    public static void main(String[] args) {
        int n = 200;
        for (int i = 100; i <= n; ++i) {
            System.out.println(i + " " + findPrime.prime(i));
        }
    }

    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            ++c;
        }
        return true;
    }
}
