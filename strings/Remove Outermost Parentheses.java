class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int count=0;
        for(char c:s.toCharArray()){//to convert a String into an array of characters (char[]). This allows us to work with the individual characters of a string
        // s = "(()())(())"
            if(c=='('){
                if(count>0){
                    result.append(c);//since not outermost
                }
                count++;
            }else{
                count--;
                if(count>0){
                    result.append(c);//since not outermost
                }
            }

        }
        return result.toString();

        
    }
}
