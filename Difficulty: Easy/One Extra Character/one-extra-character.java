class Solution {
    public char extraChar(String s1, String s2) {
        char res = 0;
        for (int i = 0; i < s1.length(); i++) {
            res ^= s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            res ^= s2.charAt(i);
        }
        return res;
    }
}