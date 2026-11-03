class Solution {
    public int nthDay(int d, int n) {
        int x = (d - (n % 7)) % 7;
        if (x < 0) {
            x += 7;
        }
        return x;
        
    }
}