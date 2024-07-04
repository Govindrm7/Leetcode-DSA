class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output=new ArrayList<>();
        helper(nums,output,0,new ArrayList<Integer>());
        return output;
    }
    public void helper(int[] nums, List<List<Integer>> output,int index, List<Integer> cur){
        output.add(new ArrayList<>(cur));
        for(int i=index;i<nums.length;i++){
            cur.add(nums[i]);
            helper(nums,output,i+1,cur);
            cur.remove(cur.size()-1);
        }
    }
}
