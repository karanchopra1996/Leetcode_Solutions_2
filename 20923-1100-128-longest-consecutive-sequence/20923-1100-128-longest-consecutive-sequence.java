class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st  = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            st.add(nums[i]);
        }
        
        int longest = 0;
        for(int num : st){
            if(!st.contains(num-1)){
                int length = 1;
                while(st.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }

        }
        return longest;
        
    }
}