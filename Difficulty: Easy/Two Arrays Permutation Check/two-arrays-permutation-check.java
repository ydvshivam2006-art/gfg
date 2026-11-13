class Solution {
    public boolean checkPermutation(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        return java.util.Arrays.equals(a, b);
    }
}