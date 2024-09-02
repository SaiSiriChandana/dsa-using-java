class Solution {
    public boolean rotateString(String s, String goal) {
        // Step 1: Check if lengths are equal
        if(s.length()!=goal.length()){
            return false;
        }
        // Step 2: Concatenate s with itself
        String doubleS=s+s;
        
        // Step 3: Check if goal is a substring of doubleS
        return doubleS.contains(goal);
    }
}
