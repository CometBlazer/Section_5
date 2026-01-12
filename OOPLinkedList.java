package Section_5;

public class OOPLinkedList {
    protected OOPLinkedListElement head;

    public OOPLinkedList() {
        this.head = null;
    }

    // Add to front
    public void add(Object value) { 
        OOPLinkedListElement newElement = new OOPLinkedListElement(value);
        newElement.setNext(head);
        head = newElement;
    }

    // Remove from front
    public void remove() {
        if (head != null) {
            head = head.getNext();
        }
    }

    // Remove at specific index
    public Object remove(int index) {
        if (head == null) throw new RuntimeException("Empty list");
        
        if (index == 0) {
            Object value = head.getValue();
            head = head.getNext();
            return value;
        }
        
        OOPLinkedListElement current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.getNext();
        }
        
        if (current == null || current.getNext() == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        Object value = current.getNext().getValue();
        current.setNext(current.getNext().getNext());
        return value;
    }

    // Get element at index
    public Object get(int index) {
        OOPLinkedListElement current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.getNext();
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return current.getValue();
    }

    public Object getHead() {
        if (head != null) {
            return head.getValue();
        }
        throw new RuntimeException("Empty list");
    }

    public Object getNth(int n) {
        return get(n);  // Can just use get() now
    }

    public int getLength() {
        OOPLinkedListElement current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return getLength();
    }
}