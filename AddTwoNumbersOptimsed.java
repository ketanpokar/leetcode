// Problem Link : https://leetcode.com/problems/add-two-numbers/

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
import java.math.BigInteger;
class AddTwoNumbersOptimsed {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode head = null, tempList = null;
        int temp = l1.val + l2.val;
        carry = temp / 10;
        head = new ListNode(temp % 10);
        tempList = head;
        l1 = l1.next;
        l2 = l2.next;
        while( l1 != null && l2 != null) {
            temp = l1.val + l2.val + carry;
            carry = temp > 9 ? 1 : 0;
            tempList.next = new ListNode(temp%10);
            tempList = tempList.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            temp = l1.val + carry;
            carry = temp > 9 ? 1 : 0;
            tempList.next = new ListNode(temp%10);
            tempList = tempList.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            temp = l2.val + carry;
            carry = temp > 9 ? 1 : 0;
            tempList.next = new ListNode(temp%10);
            tempList = tempList.next;
            l2 = l2.next;
        }
        if(carry == 1) {
            tempList.next = new ListNode(carry);
            tempList = tempList.next;
        }
        return head;
    }
}
