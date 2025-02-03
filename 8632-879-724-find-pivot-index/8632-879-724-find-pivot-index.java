class Solution {
    public int pivotIndex(int[] nums) { 
        int right = nums.length-1;
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1]; 
        } 
        for(int i = 0 ; i < nums.length; i++){
            int leftSum, rightSum;
            if(i == 0){
                leftSum = 0;
                rightSum = nums[right] - nums[i];
            }
            else{
                leftSum = nums[i-1];
                rightSum = nums[right] - nums[i];
            }
            
            if(leftSum == rightSum)  return i;
        }
        return -1; 
    }
}