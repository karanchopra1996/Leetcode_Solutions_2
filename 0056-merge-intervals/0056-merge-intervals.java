class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Step 2: Initialize a LinkedList to store the merged intervals
        LinkedList<int[]> merged = new LinkedList<>();
        
        // Step 3: Iterate through each interval
        for (int[] interval : intervals) {
            // If the list of merged intervals is empty or there is no overlap with the last merged interval
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);  // No overlap, add the interval to merged list
            } else {
                // Overlap detected, merge the current interval with the last interval in the merged list
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        
        // Step 4: Convert the merged list back to an array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
