package problem1;

public class Recursion {

    public static int method(int[] array) {
        return helper(array, 0, array[0], 0, true);
    }

    private static int helper(int[] array, int p, int q, int r, boolean flag) {
        if (p == array.length)
            return r;

        int e = helper(array, p + 1, q, r, flag);
        int f = r;
        if (array[p] > q || flag) {
            f = helper(array, p + 1, array[p], r + array[p], false);
        }
        return Integer.max(e, f);
    }
}
