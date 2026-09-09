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
        dummy.next = head;

        // assign 2 pointers this dummy node 
        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        // Move secondPtr n space ahead  which is 2 spaces ahead
        for( int i =0; i<n; i++){
            secondPtr = secondPtr.next;
        }

        // move both now , until the next of secondptr is null

        while(secondPtr.next != null ) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        // we now have to remove the node next of firstptr
        firstPtr.next = firstPtr.next.next;

        return dummy.next;
        
    }
}