class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList();
        if(root==null)
            return ans;
        solve(root,0,ans);
        return ans;        
    }
    public void solve(TreeNode root,int lev,List<Integer> ans)
    {
        if(root== null)
            return ;
        if(lev==ans.size())
            ans.add(root.val);
        solve(root.right,lev+1,ans);
        solve(root.left,lev+1,ans);
    }
}