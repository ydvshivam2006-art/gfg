
import java.util.ArrayList;

class Solution {
    private void solve(String s, int index, String curr, ArrayList<String> result) {
        result.add(curr);
        for (int i = index; i < s.length(); i++) {
            solve(s, i + 1, curr + s.charAt(i), result);
        }
    }

    public ArrayList<String> powerSet(String s) {
        ArrayList<String> result = new ArrayList<>();
        solve(s, 0, "", result);
        return result;
    }
}