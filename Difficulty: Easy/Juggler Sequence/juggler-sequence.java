import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> result = new ArrayList<>();
        result.add(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n = (long) Math.floor(Math.sqrt(n));
            } else {
                n = (long) Math.floor(Math.sqrt(n) * n);
            }
            result.add(n);
        }

        return result;
    }
}