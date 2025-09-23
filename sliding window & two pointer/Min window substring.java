class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return ""; // No possible window

        // Step 1: Store frequency of characters in t
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) + 1);
        }

        int left = 0, right = 0; // Sliding window pointers
        int minLen = Integer.MAX_VALUE; // Minimum length of substring found
        int startIndex = 0; // Starting index of the min window
        int count = 0; // Count of characters matched so far

        // Step 2: Start sliding the window
        while (right < s.length()) {
            char ch = s.charAt(right);

            // Reduce frequency in the hashmap for the current char
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);

                // If the char was needed (freq >= 0), increase matched count
                if (hm.get(ch) >= 0) {
                    count++;
                }
            }

            // Step 3: When all chars in t are matched, try to shrink window
            while (count == t.length()) {
                // Update result if current window is smaller
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                // Shrink window from left
                char leftChar = s.charAt(left);
                if (hm.containsKey(leftChar)) {
                    hm.put(leftChar, hm.get(leftChar) + 1);

                    // If this char was needed and we removed it, reduce count
                    if (hm.get(leftChar) > 0) {
                        count--;
                    }
                }

                left++; // Move left pointer forward
            }

            right++; // Expand window by moving right pointer
        }

        // Step 4: Return result
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
