package cache;


public class DLinkedList {
    public DLinkedList next;
    public DLinkedList previous;
    public int value;
    public int key;

    public DLinkedList(int key,int value) {
        this.value = value;
        this.key = key;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return (this.previous != null ? this.previous.value : "null")
                + "<_"+ (key + " , " + value)
                + "_>" + (this.next != null ? this.next.value : "null");
    }
}
