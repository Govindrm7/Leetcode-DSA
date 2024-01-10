import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (frequency.containsKey(nums[i])) {
                int counter = frequency.get(nums[i]);
                counter++;
                frequency.put(nums[i], counter);
            } else {
                frequency.put(nums[i], 1);
            }
        }
        
        // Use a PriorityQueue to get the top k frequent elements
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> frequency.get(n2) - frequency.get(n1));
        
        for (int num : frequency.keySet()) {
            pq.offer(num);
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        
        return result;
    }
}
