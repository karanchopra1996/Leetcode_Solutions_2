class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Start the DFS if the first letter matches
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    // DFS function to search the word in the grid
    public boolean dfs(char[][] board, String word, int i, int j, int index) {
        // If we have matched all letters in the word, return true
        if (index == word.length()) {
            return true;
        }
        
        // Check the boundaries of the grid and if the character doesn't match
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        // Temporarily mark the cell as visited by replacing the character
        char temp = board[i][j];
        board[i][j] = '#';  // Mark as visited
        
        // Explore all four directions: up, down, left, right
        boolean found = dfs(board, word, i - 1, j, index + 1) || // Up
                        dfs(board, word, i + 1, j, index + 1) || // Down
                        dfs(board, word, i, j - 1, index + 1) || // Left
                        dfs(board, word, i, j + 1, index + 1);   // Right
        
        // Restore the original value of the cell (backtrack)
        board[i][j] = temp;
        
        return found;
    }
}
