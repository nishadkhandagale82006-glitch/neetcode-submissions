/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        // all slow and fast at head
        ListNode slow = head;
        ListNode fast = head;

        //continue while fast can safely move 2 steps untill reaches null or not reaches null

        while( slow != null  &&  fast !=null  &&  fast.next!=null){

            // slow move 1 step , fast moves 2 steps

            slow = slow.next;
            fast = fast.next.next;

            // if they meet, means we found a loop 

            if( slow == fast){
                return true;
            }

        }

        return false;
        
    }
}