import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int maxLen = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == k) {
                maxLen = i + 1;
            }

            if (prefixMap.containsKey(currentSum - k)) {
                maxLen = Math.max(maxLen, i - prefixMap.get(currentSum - k));
            }

            if (!prefixMap.containsKey(currentSum)) {
                prefixMap.put(currentSum, i);
            }
        }

        return maxLen;
    }
}