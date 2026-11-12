class Solution {
    public void addFirst(LinkedList<Integer> l, int x) {
        l.addFirst(x);
    }

    public void addLast(LinkedList<Integer> l, int x) {
        l.addLast(x);
    }

    public int removeFirst(LinkedList<Integer> l) {
        if (l.isEmpty()) {
            return -1;
        }
        return l.removeFirst();
    }

    public int removeLast(LinkedList<Integer> l) {
        if (l.isEmpty()) {
            return -1;
        }
        return l.removeLast();
    }

    public int get(LinkedList<Integer> l, int index) {
        if (index < 0 || index >= l.size()) {
            return -1;
        }
        return l.get(index);
    }

    public int size(LinkedList<Integer> l) {
        return l.size();
    }
}