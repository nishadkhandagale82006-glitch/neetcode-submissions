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
        return inorder(root, k);
    }

    private int inorder(TreeNode node, int k) {

        if (node == null)
            return -1;

        // 1. Left
        int left = inorder(node.left, k);

        if (left != -1)
            return left;

        // 2. Root
        count++;

        if (count == k)
            return node.val;

        // 3. Right
        return inorder(node.right, k);
    }
}