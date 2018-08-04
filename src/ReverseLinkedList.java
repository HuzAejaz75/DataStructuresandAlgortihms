/**
 * Created by huzaifa.aejaz on 8/3/18.
 */
public class ReverseLinkedList {
        ListNode h;
        public ListNode reverseList(ListNode head) {
           ListNode n = helper(head);
           n.next = null;
           return h;
        }
        private ListNode helper(ListNode node) {
            if (node.next == null) {
                h = node;
                return node;
            }
            ListNode prev = helper(node.next);
            prev.next = node;
            return node;
        }
}
