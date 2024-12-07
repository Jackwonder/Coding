package 反转链表;

public class Q1 {

//    public ListNode reverseList(ListNode head) {
//        return reverse(head, null);
//    }
//    public ListNode reverse(ListNode cur, ListNode pre){
//        if (cur == null){
//            return pre;
//        }
//        ListNode temp = cur.next;
//        cur.next = pre;
//        return reverse(temp, cur);
//    }
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
