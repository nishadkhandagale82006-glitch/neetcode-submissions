class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to make merging easier
        ListNode dummy = new ListNode(Integer.MIN_VALUE);

        // Pointer used to build the merged list
        ListNode current = dummy;

        // Compare nodes while both lists have nodes
        while (list1 != null && list2 != null) {

            // Take the smaller node
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            // Move current forward
            current = current.next;
        }

        // Attach whichever list is still remaining
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Dummy node is not part of the answer
        return dummy.next;
    }
}