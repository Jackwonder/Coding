package 链表相交;

import java.util.List;

/**
 * 题目链接：
 * https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/description/
 */
public class Q1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        while (A != B){
            if (A == null){
                A = headB;
            } else {
                A = A.next;
            }
            if (B == null){
                B = headA;
            } else {
                B = B.next;
            }
        }
        return A;
    }
}
