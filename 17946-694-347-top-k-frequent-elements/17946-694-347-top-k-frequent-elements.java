class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0 ;i < nums.length; i++ ){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i], 1);
            }
            else{
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            }
        }

        List<Integer>[] arr = new ArrayList[nums.length + 1];
        
        for(int key : hmap.keySet()){
            int count = hmap.get(key);
            if(arr[count] == null){
                arr[count] = new ArrayList<>();
            }
            arr[count].add(key);  
        }
        
        int j = 0;
        int[] res = new int[k];
        for(int i = arr.length-1;  i >= 0 && j < k; i--){
            if(arr[i] != null){
                for(int m = 0; m < arr[i].size() && j < k ; m++){
                    res[j] = arr[i].get(m);
                    j++;
                }
            }
        }                            
        return res;                    
        
    }
}