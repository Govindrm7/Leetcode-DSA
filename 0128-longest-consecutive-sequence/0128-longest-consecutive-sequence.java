import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLengthSequence = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentSequenceLength = 1;

            if (!numSet.contains(currentNum - 1)) {
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSequenceLength += 1;
                }
                maxLengthSequence = Math.max(maxLengthSequence, currentSequenceLength);
            }
        }

        return maxLengthSequence;
    }
}
