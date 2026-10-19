class Solution {
    public int kthSmallest(int[] arr, int k) {
        java.util.Arrays.sort(arr);
        return arr[k - 1];
    }
}