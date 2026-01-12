package Section_5;

public interface OOPList {
    int size();
    boolean isEmpty();
    Object get(int index);
    void set(int index, Object value);
    void add(Object value);              // append
    void add(int index, Object value);   // insert at index
    Object remove(int index);
}

