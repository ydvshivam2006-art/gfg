class Solution {
    int maxLength(int arr[]) {
        java.util.HashMap<Integer, Integer> mp = new java.util.HashMap<>();
        int ans = 0;
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];

            if (curr == 0) {
                ans = i + 1;
            } else if (mp.containsKey(curr)) {
                int len = i - mp.get(curr);
                if (len > ans) {
                    ans = len;
                }
            } else {
                mp.put(curr, i);
            }
        }

        return ans;
    }
}