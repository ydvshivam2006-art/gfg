class Solution {
    public static int nextPrime(int n) {
        int next = n + 1;
        while (true) {
            boolean isPrime = true;
            if (next <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= next; i++) {
                    if (next % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                return next;
            }
            next++;
        }
    }
}