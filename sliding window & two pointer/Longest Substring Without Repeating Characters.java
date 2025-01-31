class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int maxans=0;
        Set<Character> set=new HashSet<>();
        int l=0;
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
        set.add(s.charAt(r));
        maxans=Math.max(maxans,r-l+1);
        }
        return maxans;
        

        }
        
    }
