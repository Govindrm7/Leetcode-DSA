class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> newmap=new HashMap();
        Stack<Integer> stacknew=new Stack<>();
        for(int nums:nums2){
            while(!stacknew.isEmpty() && stacknew.peek()<nums){
                newmap.put(stacknew.pop(),nums);
            }
            stacknew.push(nums);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=newmap.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}