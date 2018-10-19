/**
 * Created by huzaifa.aejaz on 10/1/18.
 */
public class palindromeReverse {
    public boolean isPalindrome(ListNode head)
    {
        ListNode nodes = head;

        ListNode reverseHead = reverse(nodes);
        while(reverseHead != null && head != null)
        {
            if(reverseHead.val != head.val)
            {
                return false;
            }
            reverseHead = reverseHead.next;
            head = head.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head){
        ListNode p = head;
        ListNode prev = new ListNode(head.val);
        while(p != null)
        {
            ListNode temp = new ListNode(p.next.val);
            temp.next = prev;
            prev = temp;
            p = p.next;
        }
        return prev;
    }
}
