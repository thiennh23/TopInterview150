package Add2Number_Optimise_2;

public class Solution {

    public static void main(String[] args) {

        //Test case
        ListNode l1 = new ListNode(9, null);
        ListNode l12 = new ListNode(9, null);
        ListNode l13 = new ListNode(9, null);
        ListNode l14 = new ListNode(9, null);
        ListNode l15 = new ListNode(9, null);
        ListNode l16 = new ListNode(9, null);
        ListNode l17 = new ListNode(9, null);
        l1.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;
        l15.next = l16;
        l16.next = l17;

        ListNode l2 = new ListNode(9, null);
        ListNode l22 = new ListNode(9, null);
        ListNode l23 = new ListNode(9, null);
        ListNode l24 = new ListNode(9, null);
        l2.next = l22;
        l22.next = l23;
        l23.next = l24;

        ListNode result = addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0, null);
        ListNode current = head;

        int remainder = 0;
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        while (l1 != null || l2 != null || remainder > 0) {
            if (l1 != null) num1 = l1.val; else num1 = 0;
            if (l2 != null) num2 = l2.val; else num2 = 0;
            sum = num1 + num2 + remainder;

            //We just need remainder, so modular 10
            if (sum / 10 != 0) remainder = 1; else remainder = 0;
            sum = sum % 10;

            //Add to new Node
            ListNode temp = new ListNode(sum, null);
            current.next = temp;
            current = current.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return head.next;
    }
}
