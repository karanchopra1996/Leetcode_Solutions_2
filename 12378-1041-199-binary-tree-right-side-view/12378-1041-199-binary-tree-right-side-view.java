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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        bfs(res, root);
        return res;
    }
    
    public void bfs(List<Integer> res, TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i<len; i++){
                TreeNode curr = q.poll();
                if(i == 0){
                    res.add(curr.val);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                 if(curr.left != null){
                    q.add(curr.left);
                }
            }
            
        }
    }
}