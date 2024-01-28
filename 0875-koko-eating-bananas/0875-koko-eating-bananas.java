class Solution {
    public boolean isValid(int[] piles, int mid, int h) {
        int totalHours = 0;
        for (int i : piles) {
            totalHours += (i + mid - 1) / mid; // Equivalent to Math.ceil(i / mid)
        }
        return totalHours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int max = 0;

        for (int i : piles) {
            max = Math.max(max, i);
        }

        while (low < max) {
            int mid = low + (max - low) / 2;

            if (isValid(piles, mid, h)) {
                max = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
