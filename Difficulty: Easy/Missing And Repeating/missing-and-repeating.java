class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        long n = arr.length;
        long sn = (n * (n + 1)) / 2;
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6;

        long s = 0;
        long s2 = 0;

        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += (long) arr[i] * (long) arr[i];
        }

        long diff1 = s - sn;
        long diff2 = s2 - s2n;

        long sum1 = diff2 / diff1;

        int repeating = (int) ((diff1 + sum1) / 2);
        int missing = (int) (sum1 - repeating);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
}