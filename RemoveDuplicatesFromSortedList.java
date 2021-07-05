// Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        

        ListNode prev = head;
        ListNode cur = head.next;
            
        while(cur != null) {
            if(prev.val == cur.val) {
                if(cur.next != null) {
                    prev.next = cur.next;
                } else {
                    prev.next = null;
                }
            } else {
                prev = prev.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
