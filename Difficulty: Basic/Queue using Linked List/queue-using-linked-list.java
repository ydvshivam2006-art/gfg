class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class myQueue {
    private Node front;
    private Node rear;
    private int count;

    public myQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
    }

    public void dequeue() {
        if (front != null) {
            front = front.next;
            if (front == null) {
                rear = null;
            }
            count--;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return front.data;
    }

    public int size() {
        return count;
    }
}