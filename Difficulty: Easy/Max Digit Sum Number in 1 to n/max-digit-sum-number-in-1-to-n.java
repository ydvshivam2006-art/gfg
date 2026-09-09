class Solution {
    public static int findMax(int n) {
        String s = Integer.toString(n);
        int len = s.length();

        int bestNum = n;
        int maxSum = sumOfDigits(n);

        char[] digits = s.toCharArray();

        for (int i = 0; i < len; i++) {
            if (digits[i] == '0') {
                continue;
            }

            char[] cand = digits.clone();
            cand[i]--;
            for (int j = i + 1; j < len; j++) {
                cand[j] = '9';
            }

            int candNum = Integer.parseInt(new String(cand));
            int candSum = sumOfDigits(candNum);

            if (candSum > maxSum) {
                maxSum = candSum;
                bestNum = candNum;
            } else if (candSum == maxSum && candNum > bestNum) {
                bestNum = candNum;
            }
        }

        return bestNum;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
