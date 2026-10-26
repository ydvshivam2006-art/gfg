class Solution {
    public ArrayList<Integer> uniqueSorted(int arr[]) {
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}