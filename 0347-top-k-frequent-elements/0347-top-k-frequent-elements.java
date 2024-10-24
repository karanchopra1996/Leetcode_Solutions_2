class Solution {
   public int[] topKFrequent(int[] nums, int k) {
        // Count the frequency of each element
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        
        // Create a min heap of size k
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(Map.Entry::getValue)
        );
        
        // Push elements into the min heap
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            minHeap.offer(entry);
            // If the size of the heap exceeds k, pop the minimum element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        // Extract the elements from the min heap
        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }
        
        return result;
    }
}