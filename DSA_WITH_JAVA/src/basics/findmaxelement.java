package basics;

public class findmaxelement {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{12, 13, 14, 15}, {17, 18, 48, 19}, {18, 19, 21}};
        int foundelement = findmaxelement.findmaxele(arr);
        System.out.println("found element:: " + foundelement);
    }

    static int findmaxele(int[][] arr) {
        int ans = arr.length;
        int[][] nArray = arr;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            int[] insarr;
            for (int element : insarr = nArray[i]) {
                if (element <= ans) continue;
                ans = element;
            }
        }
        return ans;
    }
}
