class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;  // To store the indices of the longest palindromic substring
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);       // Check for odd-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);   // Check for even-length palindrome
            int len = Math.max(len1, len2);
            
            if (len > end - start) {  // Update the indices if a longer palindrome is found
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);  // Return the longest palindromic substring
    }
    
    // Helper function to expand around a center and return the length of the palindrome
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;   // Expand to the left
            right++;  // Expand to the right
        }
        
        return right - left - 1;  // Return length of the palindromic substring
    }
}
