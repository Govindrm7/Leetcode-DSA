class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[nonZeroIndex] = nums[i];
        nonZeroIndex++;
      }
    }

    // Move the zeros to the end of the array.
    for (int i = nonZeroIndex; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}