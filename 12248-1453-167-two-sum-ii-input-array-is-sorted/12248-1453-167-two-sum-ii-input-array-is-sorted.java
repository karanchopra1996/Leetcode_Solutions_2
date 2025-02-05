class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        
        while(right > left){
            int sum = numbers[right] + numbers[left];
            
            if(sum > target){
                right--;
            }
            else if( sum < target){
                left++;
            }
            else{
                if(sum == target){
                    break;
                }
            }
            
        }
        return new int[] {left+1,right+1};
        
    }
}