public class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;  // to store the maximum area
        int left = 0;     // Start pointer 
        int right = height.length - 1; // End pointer 
        
        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the length 
            int length = right - left;
            
            // Calculate the area between the two lines & update maxArea
            maxArea = Math.max(
                maxArea,
                Math.min(height[left], height[right]) * length
            );
            // Move the pointer that's at the shorter heightand trying to find a taller one
            if (height[left] <= height[right]) {
                left++; 
            } else {
                right--; 
            }
        }
        return maxArea;
        
        
    }
}
