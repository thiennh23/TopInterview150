package Merge2SortedLists_21;

public class Solution {

    public static void main(String[] args) {
        ListNode a = new ListNode(-9);
        ListNode b = new ListNode(3, null);
        a.next = b;
        ListNode.show(a);


        ListNode d = new ListNode(5);
        ListNode e = new ListNode(7, null);
        d.next = e;
        ListNode.show(d);

        ListNode result = mergeTwoLists(a, d);
        ListNode.show(result);


    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}

        public static void show(ListNode current) {
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //Check if null -> return directly
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;
        else if (list1 == null && list2 == null)
            return list1;


        //Process
        //Create an ListNode to store result;
        ListNode head = new ListNode(-999, null);
        ListNode result = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        //Check the 1 or 2 remained nodes
        if (list1 != null) head.next = list1;
        if (list2 != null) head.next = list2;

        return result.next;
    }
}
