package 环形链表II;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题目链接：https://leetcode.cn/problems/linked-list-cycle-ii/
 */
public class Q1 {
    public ListNode detectCycle(ListNode head) {
        /*
        方法一：
        ListNode temp = head;
        Map<ListNode,Integer> map = new HashMap<>();

        while (temp != null){
            if (map.get(temp) == null) {
                map.put(temp, 1);
            } else if ( map.get(temp) ==1){
                return temp;
            }
            temp = temp.next;
        }
        return null;*/

        //方法二：
        ListNode fast = head;
        ListNode slow = head;

        while ( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                slow = head;
                while (fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;


    }
}
