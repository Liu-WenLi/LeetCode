
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = new ListNode(0, head);

        ListNode first = head;
        ListNode l = cur;
        ListNode l2 = cur;
        cur.next = head;
        int value ;
        int len = 0;
        while (first != null){
            len = len + 1;
            first = first.next;
        }


        for (int i = 1; i < len - n + 1; ++i) {
            l = l.next;
        }
        value = l.next.val;
        l.next = l.next.next;

//        while (l2 != null){
//            if (l2.val == value){
//                l2 = l2.next;
//            }
//        }
        return cur.next;
    }
}