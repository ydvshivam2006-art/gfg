class Solution {
    static int perfectSum(int[] arr, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[target];
    }
}