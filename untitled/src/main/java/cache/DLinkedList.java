package cache;


public class DoublyLinkedList {
    public DoublyLinkedList next;
    public DoublyLinkedList previous;
    public int value;
    public DoublyLinkedList(int value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
