package recursionOld;

public class PATTERN {
    public static void main(String[] args) {
        PATTERN.paramid(4, 0);
    }

    static void paramid(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            PATTERN.paramid(r, c + 1);
            System.out.print(" * ");
        } else {
            PATTERN.paramid(r - 1, 0);
            System.out.println();
        }
    }
}
