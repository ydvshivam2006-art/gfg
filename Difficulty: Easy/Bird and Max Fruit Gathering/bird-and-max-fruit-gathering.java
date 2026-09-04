import java.util.ArrayList;

class Solution {
    public int maxFruits(ArrayList<Integer> arr, int m) {
        int n = arr.size();
        if (m >= n) {
            int total = 0;
            for (int val : arr) {
                total += val;
            }
            return total;
        }

        int currentSum = 0;
        for (int i = 0; i < m; i++) {
            currentSum += arr.get(i);
        }

        int maxSum = currentSum;

        for (int i = 1; i < n; i++) {
            currentSum = currentSum - arr.get(i - 1) + arr.get((i + m - 1) % n);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}