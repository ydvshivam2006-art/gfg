class Solution {
    public int mean(int[] arr) {
        long sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (int) (sum / arr.length);
    }

    public int median(int[] arr) {
        java.util.Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[n / 2] + arr[(n / 2) - 1]) / 2;
        }
    }
}