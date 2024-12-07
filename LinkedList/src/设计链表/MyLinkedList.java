package 设计链表;

import java.util.List;

public class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        size = 0;
        head = new ListNode(size);
    }

    public int get(int index) {
        if (index < 0 || index >= size){
            return -1;
        }
        ListNode target = head;
        for (int i = 0 ; i <= index ; i++){
            target = target.next;
        }
        return target.value;
    }

    public void addAtHead(int val) {
        ListNode addNode = new ListNode(val);
        addNode.next = head.next;
        head.next = addNode;
        size++;
    }

    public void addAtTail(int val) {

        ListNode target = head;
        ListNode addNode = new ListNode(val);
        for (int i = 0 ; i < size ; i++) {
            target = target.next;
        }
        target.next = addNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode target = head;
        for (int i = 0; i < index; i++) {
            target = target.next;
        }
        ListNode addNode = new ListNode(val);
        addNode.next = target.next;
        target.next = addNode;
        size++;
    }

    public void deleteAtIndex(int index) {
            if (index < 0 || index >= size){
                return;
            }
            ListNode target = head;
        for (int i = 0; i < index; i++) {
            target = target.next;
        }
        target.next = target.next.next;
        size--;
        }
    }


class ListNode{
    int value;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(ListNode next) {
        this.next = next;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}