class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap= new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i], 1);
            }
            else{
                hmap.put(nums[i],hmap.get(nums[i])+1);
                return true;
            }
        }
        return false;
        
    }
}