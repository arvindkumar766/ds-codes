package common;

public class Node {
    public Node next,previous;
    public int key,value,freq;
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.freq = 1;
        this.next = null;
        this.previous = null;
    }
}
