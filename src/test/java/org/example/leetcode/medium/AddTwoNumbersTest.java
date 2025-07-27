package org.example.leetcode.medium;

import org.example.leetcode.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AddTwoNumbersTest {

    // Helper to construct list from digits (least significant first)
    private ListNode makeList(int... digits) {
        ListNode head = null, tail = null;
        for (int d : digits) {
            ListNode node = new ListNode(d);
            if (head == null) head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }

    // Helper to convert list to array of values
    private int[] toArray(ListNode head) {
        int[] tmp = new int[200];
        int count = 0;
        while (head != null) {
            tmp[count++] = head.val;
            head = head.next;
        }
        return Arrays.copyOf(tmp, count);
    }

    @Test
    void testSimpleAdditionNoCarry() {
        ListNode l1 = makeList(2, 4, 3);  // represents 342
        ListNode l2 = makeList(5, 6, 4);  // represents 465
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{7, 0, 8}, toArray(result),
                "342 + 465 should be 807 => [7,0,8]");
    }

    @Test
    void testOneListShorter() {
        ListNode l1 = makeList(0);           // 0
        ListNode l2 = makeList(7, 3);        // 37
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{7, 3}, toArray(result),
                "0 + 37 => [7,3]");
    }

    @Test
    void testCarryPropagation() {
        ListNode l1 = makeList(5);           // 5
        ListNode l2 = makeList(5, 9, 9);     // 995
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 0, 0, 1}, toArray(result),
                "5 + 995 => 1000 => [0,0,0,1]");
    }

    @Test
    void testBothListsDifferentLength() {
        ListNode l1 = makeList(9, 9, 9, 9, 9, 9, 9);  // 9,999,999
        ListNode l2 = makeList(9, 9, 9, 9);           // 9,999
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, toArray(result),
                "9999999 + 9999 => 10009998 => reversed [8,9,9,9,0,0,0,1]");
    }

    @Test
    void testSingleZeroNodes() {
        ListNode l1 = makeList(0);
        ListNode l2 = makeList(0);
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0}, toArray(result),
                "0 + 0 => [0]");
    }

    @Test
    void testSingleNodeWithCarry() {
        ListNode l1 = makeList(9);
        ListNode l2 = makeList(1);
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 1}, toArray(result),
                "9 + 1 => 10 => [0,1]");
    }
}
