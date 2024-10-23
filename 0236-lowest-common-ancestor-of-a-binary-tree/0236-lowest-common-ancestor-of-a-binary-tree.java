/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if we reach the end of a branch or find either p or q
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If p and q are found in different subtrees, root is their LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null value (either left or right)
        return left != null ? left : right;
    }
}
