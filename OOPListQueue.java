package Section_5;

public class OOPListQueue implements OOPQueue{
    private final OOPLinkedList in;
    private final OOPLinkedList out;
    private int size;

    public OOPListQueue() {
        in = new OOPLinkedList();
        out = new OOPLinkedList();
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(Object value) {
        in.add(value);
        size++;
    }


    private void pourInToOut() {
        // move everything from in to out in reverse order
        while (in.size() > 0) {
            Object x = in.remove(in.size() - 1);
            out.add(x);
        }
    }

    @Override
    public Object dequeue() {
        if (size == 0) throw new RuntimeException("Empty queue");
        if (out.size() == 0) pourInToOut();
        size--;
        return out.remove(out.size() - 1);
    }

    @Override
    public Object peek() {
        if (size == 0) throw new RuntimeException("Empty queue");
        if (out.size() == 0) pourInToOut();
        return out.get(out.size() - 1);
    }
}
