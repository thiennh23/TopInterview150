package Add2Nums_2;

public class Solution {

    public static void main(String[] args) {

        /*//Test case 1
        ListNode l1 = new ListNode(2, null);
        ListNode l12 = new ListNode(4, null);
        ListNode l13 = new ListNode(3, null);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(5, null);
        ListNode l22 = new ListNode(6, null);
        ListNode l23 = new ListNode(4, null);
        l2.next = l22;
        l22.next = l23;*/

        //Test case 2
        ListNode l1 = new ListNode(9, null);

        ListNode l2 = new ListNode(1, null);
        ListNode l21 = new ListNode(9, null);
        ListNode l22 = new ListNode(9, null);
        ListNode l23 = new ListNode(9, null);
        ListNode l24 = new ListNode(9, null);
        ListNode l25 = new ListNode(9, null);
        ListNode l26 = new ListNode(9, null);
        ListNode l27 = new ListNode(9, null);
        ListNode l28 = new ListNode(9, null);
        ListNode l29 = new ListNode(9, null);
        l2.next = l21;
        l21.next = l22;
        l22.next = l23;
        l23.next = l24;
        l24.next = l25;
        l25.next = l26;
        l26.next = l27;
        l27.next = l28;
        l28.next = l29;

        ListNode result = addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }

        /*while (l1 != null) {
            System.out.print(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            System.out.print(l2.val);
            l2 = l2.next;
        }*/
    }

    /*public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }*/
    public static class ListNode {
        long val;
        ListNode next;
        ListNode(){}
        ListNode(long val) {this.val = val;}
        ListNode(long val, ListNode next) {this.val = val; this.next = next;}
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(); //This will store the head of result
        ListNode head = current; //This is also "current", but I used it to go through all value

        long num1 = toNum(l1);
        long num2 = toNum(l2);
        long answer = num1 + num2;

        //First, assign the value for head
        head.val = answer % 10;
        answer = answer / 10;

        //Assign next value
        while (answer > 0) {
            ListNode temp = new ListNode(answer % 10, null);
            answer = answer / 10;
            head.next = temp;
            head = head.next;
        }

        return current;
    }

    public static long toNum(ListNode linkedList) {
        ListNode l = linkedList;
        long num = 0;
        long count = 1;
        while (l != null) {
            num += l.val * count;
            count*=10;
            l = l.next;
        }
        return num;
    }
}
