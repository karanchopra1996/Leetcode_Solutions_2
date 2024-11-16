class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0)
            return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0;
        int high = row*col;
        
        while(low < high){
            int midIndex = (low + high)/2;
           if(matrix[midIndex/col][midIndex%col] == target) {
                return true;
            } else if (matrix[midIndex/col][midIndex%col] < target) {
                low = midIndex+1;
            } else {
                high = midIndex;
            } 
        }
        return false;
        
    }
}