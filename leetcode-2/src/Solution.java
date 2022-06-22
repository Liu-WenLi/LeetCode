class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int flag = 0;
        int x = 0;
        int y = 0;
        int p = 0;
        while(l1 != null || l2 != null || flag != 0) {
            if (l1 != null ) {
                x = l1.val;
            }
            else x = 0;
            if (l2 != null )
                y = l2.val;
            else y = 0;

            if (flag != 0) {
                p = x + y + 1;
                flag = 0;
            }
            else p = x + y;
            if (p >= 10) {
                cur.next = new ListNode(p -10);
                flag = 1;
            }
            else cur.next = new ListNode(p);
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            cur = cur.next;
        }

        return pre.next;
    }
}
