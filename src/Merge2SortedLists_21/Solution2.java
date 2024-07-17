package Merge2SortedLists_21;

public class Solution2 {

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

        // create a result node to point to the head of the merged list
        ListNode result = new ListNode();
        // create a pointer to iterate through the result node
        ListNode head = result;

        // while both list1 and list2 are not null
        while (list1 != null && list2 != null) {
            // if the value of list1 is less than or equal to the value of list2
            if (list1.val <= list2.val) {
                // set the next value of head to the value of list1
                head.next = list1;
                // move list1 to the next node
                list1 = list1.next;
            }
            // otherwise
            else {
                // set the next value of head to the value of list2
                head.next = list2;
                // move list2 to the next node
                list2 = list2.next;
            }
            // move head to the next node
            head = head.next;
        }

        // if list1 is not null, set the next value of head to the value of list1
        if (list1 != null) {
            head.next = list1;
        }
        // if list2 is not null, set the next value of head to the value of list2
        if (list2 != null) {
            head.next = list2;
        }

        // return the next value of result (which is the head of the merged list)
        return result.next;
    }


}
