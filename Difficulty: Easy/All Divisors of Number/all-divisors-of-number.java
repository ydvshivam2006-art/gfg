class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> back = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    back.add(n / i);
                }
            }
        }
        for (int i = back.size() - 1; i >= 0; i--) {
            list.add(back.get(i));
        }
        return list;
    }
}