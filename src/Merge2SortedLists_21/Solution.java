package Merge2SortedLists_21;

import com.sun.source.tree.WhileLoopTree;

import java.sql.PreparedStatement;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4, null);
        a.next = b;
        b.next = c;

        ListNode.show(a);


        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4, null);
        d.next = e;
        e.next = f;
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

        while (list1.next != null || list2.next != null) {
            if (list1.val <= list2.val) {
                ListNode temp = new ListNode(list1.val, null);
                head.next = temp;
            //    System.out.print(temp.val + " -> ");
                head = temp;
                list1 = list1.next;
            } else {
                ListNode temp = new ListNode(list2.val, null);
                head.next = temp;
            //    System.out.print(temp.val + " -> ");
                head = temp;
                list2 = list2.next;
            }
        }

        //Check 2 last node
        if (list1.val <= list2.val) {
            ListNode temp = new ListNode(list1.val, null);
            ListNode temp2 = new ListNode(list2.val, null);
            head.next = temp;
        //    System.out.print(temp.val + " -> ");
            head = temp;
            head.next = temp2;
        //    System.out.print(temp2.val + " -> ");
            head = temp2;
        } else if (list1.val > list2.val) {
            ListNode temp2 = new ListNode(list1.val, null);
            ListNode temp = new ListNode(list2.val, null);
            head.next = temp;
        //    System.out.print(temp.val + " -> ");
            head = temp;
            head.next = temp2;
        //    System.out.print(temp2.val + " -> ");
            head = temp2;
        }
        result = result.next;
        return result;
    }


}
