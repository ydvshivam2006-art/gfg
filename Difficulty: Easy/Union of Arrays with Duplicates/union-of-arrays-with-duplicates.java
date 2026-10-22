class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}