package 删除链表的倒数第N个结点;

/**
 * 题目链接：https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
 */

public class Q1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode fast = demo;
        ListNode slow = demo;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return demo.next;
    }
}
