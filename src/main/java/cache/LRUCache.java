package cache;

import common.DLinkedList;

import java.util.HashMap;
import java.util.Map;
// Evict Least Recently Used from Cache
public class LRUCache {
    Map<Integer, DLinkedList> map;
    DLinkedList dummyHead;
    DLinkedList dummyTail;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        dummyHead = new DLinkedList(-1, -1);
        dummyTail = new DLinkedList(-1, -1);
        dummyTail.previous = dummyHead;
        dummyHead.next = dummyTail;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        DLinkedList existing = map.get(key);
        removeFromDLL(existing);
        addToFront(key, existing.value);
        return existing.value;
    }


    public void put(int key, int value) {
        if (map.containsKey(key)) {
            DLinkedList existing = map.get(key);
            removeFromDLL(existing);
        } else if  (map.size() == capacity) {
            removeNodeFromLast();
        }
        DLinkedList node = addToFront(key, value);
        map.put(key, node);
    }

    private void removeFromDLL(DLinkedList node) {
        DLinkedList previous = node.previous;
        DLinkedList next = node.next;
        previous.next = next;
        next.previous = previous;
        map.remove(node.key);
        System.out.println("Removed node from DLL: " + node.value);
    }

    public DLinkedList addToFront(int key, int value) {
        DLinkedList newNode = new DLinkedList(key, value);
        DLinkedList front = dummyHead.next;
        dummyHead.next = newNode;
        newNode.previous = dummyHead;
        front.previous = newNode;
        newNode.next = front;
        map.put(key, newNode);
        System.out.println("Added node to front of DLL: " + value);
        return newNode;
    }

    public void removeNodeFromLast() {
        DLinkedList last = dummyTail.previous;
        if (last != null) {
            last.previous.next = dummyTail;
            dummyTail.previous = last.previous;
            map.remove(last.key);
            System.out.println("Removed node from DLL: " + last.value);
        }
    }
}
