package Section_5;

public class OOPArrayQueue implements OOPQueue {
    private Object[] data;
    private int head; // index of the front element
    private int tail; // index for the next enqueue
    private int size; // number of elements in the queue
    public OOPArrayQueue(int capacity) {
        data = new Object[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public OOPArrayQueue() {
        this((int)10e6); // default capacity
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

     private void ensureCapacity() {
        if (size < data.length) return;

        Object[] newData = new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(head + i) % data.length];
        }
        data = newData;
        head = 0;
        tail = size;
    }

    @Override
    public void enqueue(Object x) {
        ensureCapacity();
        data[tail] = x;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public Object dequeue() {
        if (size == 0) throw new RuntimeException("Empty queue");
        Object x = data[head];
        data[head] = null;
        head = (head + 1) % data.length;
        size--;
        return x;
    }

    @Override
    public Object peek() {
        if (size == 0) throw new RuntimeException("Empty queue");
        return data[head];
    }
}