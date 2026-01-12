package Section_5;

public interface OOPQueue {
    boolean isEmpty();
    int size();
    void enqueue(Object value);
    Object dequeue();
    Object peek(); // look at head without removing
}
