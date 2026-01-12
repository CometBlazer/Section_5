package Section_5;

public class OOPLinkedListElement {
    private Object value;  
    private OOPLinkedListElement next;

    public OOPLinkedListElement(Object value) { 
        this.value = value;
        this.next = null;
    }

    public Object getValue() {  
        return value;
    }

    public void setValue(Object value) { 
        this.value = value;
    }

    public OOPLinkedListElement getNext() {
        return next;
    }

    public void setNext(OOPLinkedListElement next) {
        this.next = next;
    }
}