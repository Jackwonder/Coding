package 两两交换链表中的节点;

public class Q1 {
    public ListNode swapPairs(ListNode head) {
        if (head == null){
            return head;
        }

        ListNode cur = head;
        ListNode nextNode = null;
        ListNode temp = null;

        if (head.next != null){
            head = head.next;
        } else {
            return head;
        }

        while (cur != null) {
            nextNode = cur.next;
            if (nextNode != null ) {
                temp = nextNode.next;
            } else {
                break;
            }

            nextNode.next = cur;
            if (temp != null) {
                if (temp.next != null) {
                    cur.next = temp.next;
                } else {
                    cur.next = temp;
                }
            } else {
                cur.next = null;
            }
            cur = temp;
        }
        return head;
    }
}
