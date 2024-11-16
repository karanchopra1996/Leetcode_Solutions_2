class Solution {
    public int removeDuplicates(int[] nums) {
        int swap = 1;
        for(int index = 1; index < nums.length; index++){
            if(nums[index] != nums[index-1]){
                nums[swap] = nums[index];
                swap++;
            }
        }
        return swap;

    }
}