class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode returnnode = new ListNode(Integer.MIN_VALUE); // Dummy node
        ListNode headnode = returnnode; // Remember the start

        while (list1 != null && list2 != null) { // Both lists must exist

            if (list1.val <= list2.val) { // Pick smaller

                returnnode.next = list1; // Add list1 node
                list1 = list1.next; // Move list1
            }
            else {

                returnnode.next = list2; // Add list2 node
                list2 = list2.next; // Move list2
            }

            returnnode = returnnode.next; // Move result pointer
        }

        // One list is empty → attach the other
        if (list1 == null)
            returnnode.next = list2;
        else
            returnnode.next = list1;

        return headnode.next; // Return merged list
    }
}