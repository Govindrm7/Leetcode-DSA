class Solution {

    public static void swap(int[] nums, int i, int j){
          if(i==j) return;
          nums[i] = nums[i] + nums[j];
          nums[j] = nums[i] - nums[j];
          nums[i] = nums[i] - nums[j];
    }

    public void sortColors(int[] nums) {
        int low=0, mid =0, high =nums.length-1;
       
        while(mid<=high){
            if(nums[mid]==0) swap(nums, mid++, low++);
            else if(nums[mid]==2) swap(nums, mid, high--);
            else  mid++;
        }

    }
}