class MyMap {
    public void insert(Map<Integer, Integer> mp, int x, int y) {
        mp.put(x, y);
    }

    public int get(Map<Integer, Integer> mp, int x) {
        return mp.getOrDefault(x, -1);
    }

    public int size(Map<Integer, Integer> mp) {
        return mp.size();
    }

    public void remove(Map<Integer, Integer> mp, int x) {
        mp.remove(x);
    }
}