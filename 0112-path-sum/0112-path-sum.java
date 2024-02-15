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
     public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case

         if(root == null) return false;
        
        // Answer Case
        else if(root.left == null  && root.right == null && targetSum - root.val == 0) {
            return true;
        }
        
        // Recursive call
        else{
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
    }
}