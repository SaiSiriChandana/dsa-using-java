class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s1=strs[0];
        int i;
        for(i=0;i<s1.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length()){
                    if(s1.charAt(i)!=strs[j].charAt(i)){
                        return s1.substring(0,i);
                    }}
                else{
                    return s1.substring(0,i);
                }
            }
           
        }
        
       return s1.substring(0,i); 
    }
}
