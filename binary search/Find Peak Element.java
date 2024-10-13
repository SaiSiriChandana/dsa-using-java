//binary search algo approach
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Check if the middle element is less than the next element
            if (nums[mid] < nums[mid + 1]) {
                // Peak must be in the right half if mid is less than mid+1
                left = mid + 1;
            } else {
                // Peak must be in the left half if mid is not less than mid+1
                right = mid;
            }
        }
        
        // When left == right, we have found a peak
        return left;
    }
}
