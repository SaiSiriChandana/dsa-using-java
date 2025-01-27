class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, maxlen = 0, zeroes = 0; 

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) zeroes++; 

            // Shrink the window if zeroes exceed k
            while (zeroes > k) {
                if (nums[l] == 0) zeroes--; // Decrement zero counter if nums[l] is 0
                l++; // Move the left pointer to shrink the window
            }

            // Update the maximum length of the valid window
            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen; // Return the maximum length found
    }
}
