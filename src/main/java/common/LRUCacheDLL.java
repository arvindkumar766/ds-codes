package common;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class LRUCacheDLL {
    public LRUCacheDLL next, prev;
    public int key, value, count;

    public LRUCacheDLL(int key, int value, int count) {
        this.key = key;
        this.value = value;
        this.count = count;
        this.next = null;
        this.prev = null;
    }

    public void removeFromLast(Node node) {

    }

    public void remove(Node node) {

    }

    public void addToFront(Node node) {
    }
}
