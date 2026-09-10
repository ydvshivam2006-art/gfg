class Solution {
    static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);

        for (int x : arr) {
            int size = res.size();

            for (int i = 0; i < size; i++) {
                res.add(res.get(i) + x);
            }
        }

        return res;
    }
}