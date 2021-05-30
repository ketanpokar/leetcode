package leetcode;

import java.math.BigInteger;

public class AddTwoNumbers {

    public static void main(String[] args) {
        addTwoNumbers(null, null);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1 = "";
        if(l1 != null) {
            do {
                num1 = String.valueOf(l1.val) + num1;
                l1 = l1.next;
            } while(l1.next != null);
        }

        String num2 = "";
        if(l2 != null) {
            do {
                num1 = String.valueOf(l2.val) + num1;
                l2 = l2.next;
            } while(l2 != null);
        }

        System.out.println(num1 + " " + num2);

        BigInteger result = new BigInteger(num1).add(new BigInteger(num2));
        //long result = 10000000000l;
//        BigInteger bigResult = new BigInteger("1000000000000000000000000000456");
        BigInteger bigResult = new BigInteger(num1).add(new BigInteger(num2));

        ListNode head = null;
        ListNode temp = null;
        while(bigResult.compareTo(BigInteger.valueOf(0)) > 0){
            //System.out.println(result%10);
//            long num = result%10;
            BigInteger bigNum = bigResult.mod(BigInteger.valueOf(10));
            long num = bigNum.intValue();

            ListNode numNode = new ListNode((int)num, null);

            if(head == null) {
                head = numNode;
                temp = numNode;
            } else {
                temp.next = numNode;
                temp = temp.next;
            }
            //result = result/10;
            bigResult = bigResult.divide(BigInteger.valueOf(10));
        }

        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        return head;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



