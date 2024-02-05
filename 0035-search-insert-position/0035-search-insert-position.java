class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]<target){
                if (i == nums.length - 1 ||nums[i + 1] > target) {
                    return i + 1;
                }
            }
            else if(nums[0]>target){
                return 0;
            }
        }
    
    
        return nums.length;
    }
}