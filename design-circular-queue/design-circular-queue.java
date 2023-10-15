class MyCircularQueue {
    int head = 0;
    int tail = -1;
    int maxSize = 0;
    
    int[] queue;

    public MyCircularQueue(int k) {
        queue = new int[k];
        maxSize = k;
    
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        
        tail = (tail + 1) % maxSize;
        queue[tail] = value;
        
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        
        if (head == tail) {
            head = 0;
            tail = -1;
        } else {
            head = (head + 1) % maxSize;
        }
        
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        } else {
            return queue[head];
        }
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        } else {
            return queue[tail];
        }
    }
    
    public boolean isEmpty() {
        return tail == -1;
        
    }
    
    public boolean isFull() {
        return !isEmpty() && (tail + 1) % maxSize == head;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */