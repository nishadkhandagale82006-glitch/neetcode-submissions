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

    public boolean isValidBST(TreeNode root) {

        List<Integer> inorderList = new LinkedList<>();

        helper(root, inorderList);

        for (int i = 1; i < inorderList.size(); i++) {

            if (inorderList.get(i) <= inorderList.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    void helper(TreeNode treeNode, List<Integer> inorderList) {

        if (treeNode == null) {
            return;
        }

        helper(treeNode.left, inorderList);

        inorderList.add(treeNode.val);

        helper(treeNode.right, inorderList);
    }
}