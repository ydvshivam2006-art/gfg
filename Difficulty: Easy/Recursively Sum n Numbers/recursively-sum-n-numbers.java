class Solution {
    public static int recurSum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + recurSum(n - 1);
    }

    public static int recursiveSum(int n) {
        return recurSum(n);
    }
}