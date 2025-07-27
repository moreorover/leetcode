package org.example.leetcode.medium;

import org.example.leetcode.ListNode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        ListNode cl1 = l1;
        ListNode cl2 = l2;
        int carry = 0;
        while (cl1 != null || cl2 != null || carry > 0) {
            int v1 = cl1 != null ? cl1.val : 0;
            int v2 = cl2 != null ? cl2.val : 0;
            int sum = v1 + v2 + carry;
            if (sum >= 10) {
                head.val = sum - 10;
                carry = 1;
            } else {
                head.val = sum;
                carry = 0;
            }
            if ((cl1 != null && cl1.next != null) || (cl2 != null && cl2.next != null) || carry > 0) {
                head.next = new ListNode(0);
                head = head.next;
            }
            if (cl1 != null) cl1 = cl1.next;
            if (cl2 != null) cl2 = cl2.next;
        }

        return dummy;
    }
}
