class Solution {

    public int search(int[] nums, int target) {
        return modifiedBinarySearch(nums, target, 0, nums.length - 1);
    }

    public int modifiedBinarySearch(int[] nums, int target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        // Target found
        if (nums[mid] == target) {
            return mid;
        }

        // Left half is sorted
        if (nums[left] <= nums[mid]) {

            // Target lies in sorted left half
            if (nums[left] <= target && target < nums[mid]) {
                return modifiedBinarySearch(nums, target, left, mid - 1);
            }

            // Search right half
            else {
                return modifiedBinarySearch(nums, target, mid + 1, right);
            }
        }

        // Right half is sorted
        else {

            // Target lies in sorted right half
            if (nums[mid] < target && target <= nums[right]) {
                return modifiedBinarySearch(nums, target, mid + 1, right);
            }

            // Search left half
            else {
                return modifiedBinarySearch(nums, target, left, mid - 1);
            }
        }
    }
}
        