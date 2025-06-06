/* 2434. Using a Robot to Print the Lexicographically Smallest String

You are given a string s and a robot that currently holds an empty string t. Apply one of the following operations until s and t are both empty:

Remove the first character of a string s and give it to the robot. The robot will append this character to the string t.
Remove the last character of a string t and give it to the robot. The robot will write this character on paper.
Return the lexicographically smallest string that can be written on the paper.

Example :
Input: s = "zza"
Output: "azz"
Explanation: Let p denote the written string.
Initially p="", s="zza", t="".
Perform first operation three times p="", s="", t="zza".
Perform second operation three times p="azz", s="", t="".
*/
class Solution {
    public String robotWithString(String s) {
         int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            int ch = c - 'a';
            freq[ch]--;
            stack.push(ch);

            while (!stack.isEmpty() && !hasSmaller(stack.peek(), freq)) {
                result.append((char) (stack.pop() + 'a'));
            }
        }

        return result.toString();
    }

    private boolean hasSmaller(int top, int[] freq) {
        for (int i = 0; i < top; i++) {
            if (freq[i] > 0) return true;
        }
        return false;
    }
}
