import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        
        String prev = ""; // store the previous word's sorted form
        
        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            
            if (!sorted.equals(prev)) { // if not an anagram of previous
                result.add(word);
                prev = sorted; // update prev
            }
        }
        
        return result;
    }
}
