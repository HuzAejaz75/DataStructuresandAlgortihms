import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by huzaifa.aejaz on 7/7/18.
 */
public class mergeKSorted {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode l1, ListNode l2) {
                return l2.val - l1.val;
        }
        });
        ListNode dummy = new ListNode(-1);
        for(ListNode col : lists) {
            if(col != null) pq.offer(col);
        }
        ListNode head = dummy;
        while(!pq.isEmpty()) {
            ListNode tmp = pq.poll();
            if(tmp.next != null) pq.offer(tmp.next);
            head.next = tmp;
            head = head.next;

        }
        return dummy.next;
    }
}
