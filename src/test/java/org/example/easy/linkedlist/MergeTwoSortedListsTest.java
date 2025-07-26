package org.example.easy.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeTwoSortedListsTest {

    // Helper method to create a linked list from array
    private ListNode createList(int... values) {
        if (values == null || values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to convert a linked list to string
    private String listToString(ListNode head) {
        if (head == null) return "null";
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(" -> ");
            head = head.next;
        }
        return sb.toString();
    }

    @Test
    void testBasicMerge() {
        ListNode list1 = createList(1, 2, 4);
        ListNode list2 = createList(1, 3, 4);
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals("1 -> 1 -> 2 -> 3 -> 4 -> 4", listToString(result));
    }

    @Test
    void testOneEmptyList() {
        ListNode list1 = null;
        ListNode list2 = createList(0);
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals("0", listToString(result));
    }

    @Test
    void testBothEmptyLists() {
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertNull(result);
    }

    @Test
    void testNoOverlap() {
        ListNode list1 = createList(1, 2, 3);
        ListNode list2 = createList(4, 5, 6);
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> 6", listToString(result));
    }

    @Test
    void testDuplicateValues() {
        ListNode list1 = createList(1, 1, 1);
        ListNode list2 = createList(1, 1);
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals("1 -> 1 -> 1 -> 1 -> 1", listToString(result));
    }
}
