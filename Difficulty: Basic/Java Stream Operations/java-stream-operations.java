class Solution {
    public double streamAverage(int[] arr) {
        return java.util.Arrays.stream(arr).average().orElse(0.0);
    }

    public int streamMin(int[] arr) {
        return java.util.Arrays.stream(arr).min().orElse(0);
    }

    public int streamMax(int[] arr) {
        return java.util.Arrays.stream(arr).max().orElse(0);
    }

    public int streamSum(int[] arr) {
        return java.util.Arrays.stream(arr).sum();
    }
}