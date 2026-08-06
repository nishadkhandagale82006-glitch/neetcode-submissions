class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nextGreater = new int[10001];
        Stack<Integer> stack = new Stack<>();

        // Find next greater element for every number in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nextGreater[nums2[i]] = -1;
            } else {
                nextGreater[nums2[i]] = stack.peek();
            }

            stack.push(nums2[i]);
        }

        // Build answer for nums1
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreater[nums1[i]];
        }

        return nums1;
    }
}