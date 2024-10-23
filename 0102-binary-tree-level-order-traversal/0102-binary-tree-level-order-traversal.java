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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Resultant list
        List<List<Integer>> res = new ArrayList<>();
        //Queue to handle nodes
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return res;
        }
        q.add(root);
        while(q.size() > 0){
            int levelLength  = q.size();
            List<Integer> lis = new ArrayList<>();
            
            //For each level calculating a separate list
            for(int i = 0; i<levelLength; i++){
                TreeNode curr  = q.poll();
                lis.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            } 
           res.add(lis); 
        }
     return res;   
    }
}
    
  
