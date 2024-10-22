class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Using set to avoid duplicacy
        HashSet<Character> set = new HashSet<>();
        
        int maxlen = 0;
        int left = 0; // left pointer
        int right = 0; // right pointer
        //Looping through the string 
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                //Calculating the window length
                maxlen = Math.max(maxlen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
        
    }
}