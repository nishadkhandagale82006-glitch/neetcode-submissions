/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int count = 0;

    public int kthSmallest(TreeNode root, int k) {

        // Go to the left subtree first
        if (root.left != null) {

            // Call the same method recursively
            int left = kthSmallest(root.left, k);

            // If answer was found in left subtree, return it
            if (left != -1) {
                return left;
            }
        }

        // Visit current node
        count++;

        // If this is the kth visited node
        if (count == k) {
            return root.val;
        }

        // Go to the right subtree
        if (root.right != null) {
            return kthSmallest(root.right, k);
        }

        // Answer not found
        return -1;
    }
}