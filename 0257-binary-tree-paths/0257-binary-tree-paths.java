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
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        String currentPath = Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            result.add(currentPath);
        }
        if (root.left != null) {
            dfs(root.left, currentPath, result);
        }
        if (root.right != null) {
            dfs(root.right, currentPath, result);
        }
        return result;
    }

    private void dfs(TreeNode node, String currentPath, List<String> result) {
        currentPath += "->" + node.val;
        if (node.left == null && node.right == null) {
            result.add(currentPath);
            return;
        }
        if (node.left != null) {
            dfs(node.left, currentPath, result);
        }
        if (node.right != null) {
            dfs(node.right, currentPath, result);
        }
    }
}

