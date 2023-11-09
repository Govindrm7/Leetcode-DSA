class Solution {
    public void rotate(int[] nums, int k) {
        
        //Ensure k is within array bounds
        k=k%nums.length;
        int n=nums.length;
        //we will follow below logic here:
        //1st: we will reverse entire array:
        reverse(nums,0,n-1);
        //2nd: reverse first k elements:
        reverse(nums,0,k-1);
        //3rd: reverse remaining elements:
        reverse(nums,k,n-1);  
    }
    public static void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {//swap elements here to make reverse
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;end--;
        }
    }
}