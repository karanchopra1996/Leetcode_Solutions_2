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

// Approach : Top Down DFS
class Solution {
    public boolean isValidBST(TreeNode root) {
        //Initialize the validate process , no constraint on the root node
        return validate(root, null, null);
    }
    
    // recursive function to check the property
    public boolean validate(TreeNode root, Integer low, Integer high){
        
        if(root == null) return true;
        
        if((low != null && root.val <= low) || (high != null && root.val >= high)){
            return false;
        } 
           
        return validate(root.left, low, root.val) && validate(root.right, root.val, high);   
    }
}