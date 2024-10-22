class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array of numbers
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int complement = target - currentNumber;
            
            // Check if the complement of the current number exists in the map
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers that add up to the target
                return new int[] {i, map.get(complement)};
            }
            
            // Store the current number and its index in the map
            map.put(currentNumber, i);
        }
        
        // If no pair is found, return an array with -1, -1
        return new int[] {-1, -1};
    }
}
