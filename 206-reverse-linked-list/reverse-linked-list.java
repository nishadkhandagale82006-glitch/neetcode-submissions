class Solution {
    public ListNode reverseList(ListNode head) {

        // check if headis null or headnext is null return null
        if( head == null) return null;
        if( head.next == null) return head;

        // make a node , make prenode = null 
        // make a node , currnode  = head
        ListNode prenode = null;
        ListNode currnode = head;

        // traverse until currnode reaches null
        while( currnode != null){

            ListNode nextnode = currnode.next; // make a node nextnode pointing to next of currnode 
            currnode.next = prenode; // now make change it currnode now points to prenode which is null

            prenode = currnode; // now prenode is currrnode 
            currnode = nextnode; // currnode is nextnode 
        }
        head = prenode; // now head is prenode 
        return head;  // return head
    }
}