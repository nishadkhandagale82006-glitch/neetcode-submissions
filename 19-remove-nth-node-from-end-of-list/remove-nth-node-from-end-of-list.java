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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // create a dummy node

        ListNode dummy = new ListNode(-1);
        dummy.next = head;  // dummy is pointing to head

        ListNode first = dummy;
        ListNode second = dummy;

        for( int i=0 ; i<n; i++){  // move the second pointer n times 
            second = second.next;
        }

        while( second.next != null){ // traverse until the second pointer reaches the null
            first = first.next;
            second = second.next;
        }
        // remove the element next to first pointer

        first.next = first.next.next;
        return dummy.next;  // now we return dummy next it would return whole linkdd list 

    }
}