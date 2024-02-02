class Solution {
    public int removeDuplicates(int[] nums) {
        int counter=0;
        for(int j=0;j<nums.length;j++){
            if(j<nums.length-2 && nums[j]==nums[j+1] && nums[j+1]==nums[j+2] ){
                continue;
            }else{
             nums[counter]=nums[j];
                counter++;   
            }
            }
        return counter;

        
    }
}
