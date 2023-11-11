class Solution {
    public int missingNumber(int[] nums) {
        int flag = 0; // Declare flag variable

        for (int i = 0; i <= nums.length; i++) {
            flag = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    flag = 1;
                    break; // Once the number is found, no need to continue checking
                }
            }

            if (flag == 0) {
                return i;
            }
        }

        return -1; // Handle the case when the missing number is at the end
    }
}
