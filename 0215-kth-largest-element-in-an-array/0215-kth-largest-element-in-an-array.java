class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);  // Min-Heap with capacity k
        
        for (int num : nums) {
            minHeap.offer(num);  // Add elements to the heap
            
            // Keep only the k largest elements in the heap
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the smallest element
            }
        }
        
        return minHeap.peek();  // The root of the heap is the kth largest element
    }
}
