import java.util.Arrays;

class Solution {
    private int[][][] dp;

    private int solve(int idx, int incIdx, int decIdx, int[] arr, int n) {
        if (idx == n) {
            return 0;
        }
        if (dp[idx][incIdx + 1][decIdx + 1] != -1) {
            return dp[idx][incIdx + 1][decIdx + 1];
        }

        int ans = 1 + solve(idx + 1, incIdx, decIdx, arr, n);

        if (incIdx == -1 || arr[idx] > arr[incIdx]) {
            ans = Math.min(ans, solve(idx + 1, idx, decIdx, arr, n));
        }

        if (decIdx == -1 || arr[idx] < arr[decIdx]) {
            ans = Math.min(ans, solve(idx + 1, incIdx, idx, arr, n));
        }

        return dp[idx][incIdx + 1][decIdx + 1] = ans;
    }

    public int minCount(int[] arr) {
        int n = arr.length;
        dp = new int[n + 1][n + 2][n + 2];
        for (int[][] row2D : dp) {
            for (int[] row1D : row2D) {
                Arrays.fill(row1D, -1);
            }
        }
        return solve(0, -1, -1, arr, n);
    }
}