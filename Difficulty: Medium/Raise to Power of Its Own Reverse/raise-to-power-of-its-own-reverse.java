class Solution {
    public int reverseExponentiation(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        long ans = 1;
        long base = n;
        int exp = rev;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans = ans * base;
            }
            base = base * base;
            exp >>= 1;
        }

        return (int) ans;
    }
}
