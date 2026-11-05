class myQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public myQueue(int n) {
        this.capacity = n;
        this.arr = new int[n];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int x) {
        if (!isFull()) {
            arr[rear] = x;
            rear = (rear + 1) % capacity;
            size++;
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            front = (front + 1) % capacity;
            size--;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[(rear - 1 + capacity) % capacity];
    }
}