class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] prerequisite : prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
        }
        
        boolean[] visit = new boolean[numCourses];
        boolean[] inStack = new boolean[numCourses];
        for(int i =0; i < numCourses; i++){
            if(dfs(i,adj,visit,inStack)){
                return false;
            }
        }
        return true;
    }
    
    public boolean dfs(int node, List<List<Integer>> adj, boolean[] visit, boolean[] inStack){
       // if the node is already in the stack, we have a cycle
        if(inStack[node]){
            return true;
        }
        if(visit[node]){
            return false;
        }
        // mark The current node as visited and part of current recursion
        
        visit[node] = true;
        inStack[node] = true;
        
        for(int neighbor: adj.get(node)){
            if(dfs(neighbor, adj, visit, inStack)){
                return true;
            }
        }
        
        // remove the node from the stack
        inStack[node] = false;
        return false;
        
    }
}