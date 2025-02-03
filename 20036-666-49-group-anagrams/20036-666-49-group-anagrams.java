class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for(String s: strs){
            int[] letterCount = new int[26];
            for(int i = 0; i < s.length(); i++){
                char letter = s.charAt(i);
                int index = letter -'a';
                letterCount[index]++;
            }
            
            String key = Arrays.toString(letterCount);
            
            if(!anagram.containsKey(key)){
                anagram.put(key, new ArrayList<>());
            }
            
            anagram.get(key).add(s);
            
    }
        return new ArrayList<>(anagram.values());
        
    }
}


