//leetcode problem no 2942
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(char ch:words[i].toCharArray()){
                if(ch==x){
                    ans.add(i);//adding the index no
                    break;
                }
            }
        }
        return ans;
    }
}
