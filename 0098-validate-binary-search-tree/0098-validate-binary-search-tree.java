class Solution {
    public boolean isValidBST(TreeNode root) {
        return BST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean BST(TreeNode root,long min,long max){
        if(root==null)
            return true;
        if(root.val<=min || root.val>=max)
            return false;
        return BST(root.left,min,root.val) &&BST(root.right,root.val,max);
    }
}
