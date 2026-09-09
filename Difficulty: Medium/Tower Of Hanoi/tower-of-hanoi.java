class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if (n == 0) {
            return 0;
        }
        return (1 << n) - 1;
    }
}
