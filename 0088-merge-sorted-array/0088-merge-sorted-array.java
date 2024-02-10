class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int count=0;
        int size=m+n;
        for(int i=m;i<size;i++){
            nums1[i]=nums2[count++];
        }
        Arrays.sort(nums1);
    }
}