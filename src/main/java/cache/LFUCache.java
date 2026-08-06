package cache;

import common.DLinkedList;
import common.LRUCacheDLL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO: not yet implemented
public class LFUCache {

    Map<Integer, LRUCacheDLL> frequencyMap;
    Map<Integer, DLinkedList> map;
    int capacity;
    int currentFrequency;

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        return -1;
    }

    public void put(int key, int value) {

    }

}
