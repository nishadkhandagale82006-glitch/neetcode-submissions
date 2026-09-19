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


 // "Are the trees starting from these two nodes exactly identical?"
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // If subRoot is empty, it is a subtree
        if (subRoot == null) {
            return true;
        }

        // If root is empty but subRoot is not
        if (root == null) {
            return false;
        }

        // Check if trees are identical from this node
        //Search through root and find whether subRoot exists anywhere inside it as an identical tree.
        if (isSameTree(root, subRoot)) {
            return true;
        }

       //"If the subtree starting at the current node is not subRoot, then search the LEFT subtree OR the RIGHT subtree.
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    // Checks whether two trees are identical
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}