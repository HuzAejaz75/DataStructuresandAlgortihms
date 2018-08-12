import java.util.HashMap;

/**
 * Created by huzaifa.aejaz on 8/8/18.
 */
public class LRU_Cache {
    Node head;
    Node tail;
    HashMap<Integer,Node> map;
    int capacity;

    public LRU_Cache(int capacity)
    {
        this.capacity = capacity;
        this.map = new HashMap<Integer,Node>();
    }

    public int get(int key) {
        if(map==null || !map.containsKey(key))
        {
            return -1;
        }else
            {
            Node node = map.get(key);
            updateList(node);
            return node.value;
        }

    }

    public void put(int key, int value) {//inserts the value
        //if it is already there then update
        if(!map.containsKey(key))
        {
            if(map.size()==capacity){
                removeNode();
            }
            Node node = new Node(key,value);
            addNode(node);
            map.put(key,node);
        }
        else{
            Node node = map.get(key);
            updateList(node);
            node.value = value;

        }
    }

    public void updateList(Node node){
        if(node == head) return;
        if(node == tail){
            tail = node.prev;
            tail.next = null;
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
            return;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
    }
    public  void addNode(Node node){
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void removeNode(){
        map.remove(tail.key);
        if(head == tail){
            head = null;
            tail= null;
            return;
        }
        Node newtail = tail.prev;
        tail.prev = null;
        newtail.next = null;
        tail = newtail;

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
