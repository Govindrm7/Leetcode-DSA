class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is symmetric
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true; // Both subtrees are empty, so they are symmetric
        }
        if (left == null || right == null) {
            return false; // One subtree is empty, but the other is not, so they are not symmetric
        }

        // Check if values are equal and the subtrees are symmetric
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
