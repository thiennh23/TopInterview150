package Add2Numbers_2_secondWay;

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

        /*//Test case 2
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
        l28.next = l29;*/

        //Test case 3
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
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int result = calculateResult(l1.val, l2.val, 0);
        int remainders = calculateRemainder(l1.val, l2.val, 0);
        l1 = l1.next;
        l2 = l2.next;
        ListNode current = new ListNode(result, null); //This will store the head of result
        ListNode head = current; //This is also "current", but I used it to go through all value



        while (l1 != null && l2 != null) {
            result = calculateResult(l1.val, l2.val, remainders);
            remainders = calculateRemainder(l1.val, l2.val, remainders);
            ListNode temp = new ListNode(result, null);
            l1 = l1.next;
            l2 = l2.next;
            head.next = temp;
            head = temp;
        }

        //Check if is there any number in l1, l2
        //if yes, continue add
        if (l1 == null && l2 != null) {
            while (l2 != null) {
                result = calculateResult(0, l2.val, remainders);
                remainders = calculateRemainder(0, l2.val, remainders);
                ListNode temp = new ListNode(result, null);
                l2 = l2.next;
                head.next = temp;
                head = temp;
            }
        }
        else if (l1 != null && l2 == null) {
            while (l1 != null) {
                result = calculateResult(0, l1.val, remainders);
                remainders = calculateRemainder(0, l1.val, remainders);
                ListNode temp = new ListNode(result, null);
                l1 = l1.next;
                head.next = temp;
                head = temp;
            }
        }

        //Check if is there any remainder or not
        if (l1 == null && l2 == null && remainders > 0) {
            ListNode temp = new ListNode(remainders, null);
            head.next = temp;
            head = temp;
        }

        return current;
    }

    public static int calculateResult(int num1, int num2, int remain) {
        if (num1 + num2 + remain < 10)
            return num1 + num2 + remain;
        else return (num1 + num2 + remain) - 10;
    }

    public static int calculateRemainder(int num1, int num2, int remain) {
        if (num1 + num2 + remain < 10)
            return 0;
        else return 1;
    }

}
