import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            if (nums[l] != nums[l + 1]) {
                l++;
            } else {
                return nums[l];
            }
        }

        return -1;
    }
}
