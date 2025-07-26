package org.example.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list1Array = new ArrayList<>();

        while (list1 != null) {
            list1Array.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            list1Array.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(list1Array);

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        for (int i : list1Array) {
            head.next = new ListNode(i);
            head = head.next;
        }
        return dummy.next;
    }
}
