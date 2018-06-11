import java.util.HashMap;
import java.util.Map;

/**
 * Created by huzaifa.aejaz on 6/9/18.
 */
public class LFU {
    class Node {
        int key;

        Node prev;
        Node next;

        Node() {
            key = 0;
            prev = null;
            next = null;
        }

        Node(int key) {
            this.key = key;
            prev = null;
            next = null;
        }
    }

    class LFUInfo {
        int cnt;
        Node head;
        Node tail;

        LFUInfo() {
            cnt = 0;
            head = null;
            tail = null;
        }

        LFUInfo(int cnt, Node head, Node tail) {
            this.cnt = cnt;
            this.head = head;
            this.tail = tail;
        }
    }

    class CacheItem {
        int freq;
        int val;
        Node item;

        CacheItem() {
            freq = 0;
            val = 0;
            item = null;
        }

        CacheItem(int freq, int val, Node item) {
            this.freq = freq;
            this.val = val;
            this.item = item;
        }
    }

    class LFUCache {
        private int cnt = 0;
        private int cap = 0;
        private int minf = 0;

        private Map<Integer, CacheItem> key2item = new HashMap<>();
        private Map<Integer, LFUInfo> freq2item = new HashMap<>();

        private boolean isFull() {
            return cnt == cap;
        }

        private void evict() {
            LFUInfo info = freq2item.get(minf);
            Node item = info.head.next;
            item.prev.next = item.next;
            item.next.prev = item.prev;
            info.cnt--;
            if (info.cnt == 0) {
                freq2item.remove(minf);
            }
            key2item.remove(item.key);

            --cnt;
        }

        private void incFreq(int key) {
            int freq = key2item.get(key).freq;
            Node item = key2item.get(key).item;

            item.prev.next = item.next;
            item.next.prev = item.prev;
            freq2item.get(freq).cnt--;
            if (freq2item.get(freq).cnt == 0) {
                freq2item.remove(freq);
                if (freq == minf) {
                    minf = freq + 1;
                }
            }

            ++freq;
            key2item.get(key).freq++;

            if (!freq2item.containsKey(freq)) {
                Node head = new Node();
                Node tail = new Node();
                head.next = tail;
                tail.prev = head;
                freq2item.put(freq, new LFUInfo(0, head, tail));
            }

            Node tail = freq2item.get(freq).tail;
            item.next = tail;
            tail.prev.next = item;
            item.prev = tail.prev;
            tail.prev = item;
            freq2item.get(freq).cnt++;
        }

        private void add(int key, int val) {
            minf = 1;

            if (!freq2item.containsKey(1)) {
                Node head = new Node();
                Node tail = new Node();
                head.next = tail;
                tail.prev = head;
                freq2item.put(1, new LFUInfo(0, head, tail));
            }

            Node tail = freq2item.get(1).tail;
            Node item = new Node(key);
            item.next = tail;
            tail.prev.next = item;
            item.prev = tail.prev;
            tail.prev = item;

            freq2item.get(1).cnt++;
            ++cnt;

            key2item.put(key, new CacheItem(1, val, item));
        }

        public LFUCache(int capacity) {
            cap = capacity;
        }

        public int get(int key) {
            if (cap == 0 || !key2item.containsKey(key)) {
                return -1;
            }

            int res = key2item.get(key).val;
            incFreq(key);

            return res;
        }

        public void put(int key, int value) {
            if (cap == 0) {
                return;
            }

            if (!key2item.containsKey(key)) {
                if (isFull()) {
                    evict();
                }
                add(key, value);
            } else {
                key2item.get(key).val = value;
                incFreq(key);
            }
        }
    }
}
