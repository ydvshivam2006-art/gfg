import java.io.*;
import java.util.*;

class Solution {
    public static String compareNM(int n, int m) {
        if (n < m) {
            return "less";
        } else if (n > m) {
            return "greater";
        } else {
            return "equal";
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.print(Solution.compareNM(n, m));
        }
    }
}