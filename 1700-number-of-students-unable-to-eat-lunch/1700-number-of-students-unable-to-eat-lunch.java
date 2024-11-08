class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int squarePreferred = 0;
        int circlePreferred = 0;
        
        for(int i = 0; i<students.length; i++){
            if(students[i] == 0)
               circlePreferred++; 
            if(students[i] == 1)
                squarePreferred++;
        }
        
        for(int j = 0; j<sandwiches.length; j++){
            if(sandwiches[j] == 0 && circlePreferred ==0){
                return squarePreferred;
            }
            if(sandwiches[j] == 1 && squarePreferred ==0){
                return circlePreferred;
            }
            
            if(sandwiches[j] == 0){
                circlePreferred--;
            }
            else{
                squarePreferred--;
            }
        }
        return (circlePreferred + squarePreferred);    
        
    }
}