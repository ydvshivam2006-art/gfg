class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];

        for (int num : arr) {
            if (num >= 1 && num <= n) {
                freq[num]++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            result.add(freq[i]);
        }

        return result;
    }
}