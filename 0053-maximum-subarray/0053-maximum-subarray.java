class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];         // Initialize maxSum to the first element
        int currentSum = nums[0];     // Initialize currentSum to the first element
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);  // Either add to the current sum or start new
            maxSum = Math.max(maxSum, currentSum);                 // Update maxSum if currentSum is greater
        }
        
        return maxSum;  // Returning the Max Sum found
    }
}
