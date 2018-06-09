import java.util.HashMap;
import java.util.Map;

/**
 * Created by huzaifa.aejaz on 6/8/18.
 */
public class LR {

        private Node head;
        private Node tail;
        private Map<Integer, Node> map;
        private final int capacity;

        public LR(int capacity) {
            this.capacity = capacity;
            this.map = new HashMap<>();
        }

        public void put(int key, int value) {
            if (!map.containsKey(key)) {
                if (map.size() == capacity) {
                    removeLRUCache();
                }
                Node node = new Node(key, value);
                addNode(node);
                map.put(key, node);
            } else {
                Node node = map.get(key);
                updateOrder(node);
                node.value = value;
            }
        }

        public int get(int key) {
            if (map == null || !map.containsKey(key)) {
                return -1;
            } else {
                Node node = map.get(key);
                updateOrder(node);
                return node.value;
            }
        }

        private void addNode(Node node) {
            if (head == null) {
                head = node;
                tail = node;
                return;
            }

            node.next = head;
            head.prev = node;
            head = node;
        }

        private void updateOrder(Node node) {
            if (node == head) {//MRU, do nothing
                return;
            }

            if (node == tail) {//not head, but tail
                tail = node.prev;
                node.prev.next = null;
                node.prev = null;
                node.next = head;
                head.prev = node;
                head = node;
                return;
            }
            //not head, not tail
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }

        private void removeLRUCache() {
            map.remove(tail.key);
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }

            Node newTail = tail.prev;
            tail.prev = null;
            newTail.next = null;
            tail = newTail;
        }

        class Node {
            int key;
            int value;
            Node prev;
            Node next;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
}

