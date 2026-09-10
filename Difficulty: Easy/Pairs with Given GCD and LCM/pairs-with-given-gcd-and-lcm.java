import java.util.*;

class Solution {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int pairCount(int x, int y) {
        if (y % x != 0)
            return 0;

        int n = y / x;
        int ans = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int j = n / i;

                if (gcd(i, j) == 1) {
                    if (i == j)
                        ans++;
                    else
                        ans += 2;
                }
            }
        }

        return ans;
    }
}