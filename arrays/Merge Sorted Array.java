class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;  // Point to the last element in the initial part of nums1
        int right = n - 1; // Point to the last element in nums2
        int k = m + n - 1; // Point to the last position in nums1

        while (left >= 0 && right >= 0) {
            if (nums1[left] > nums2[right]) {
                nums1[k] = nums1[left];
                left--;
            } else {
                nums1[k] = nums2[right];
                right--;
            }
            k--;
        }

        // If there are any remaining elements in nums2, copy them over to nums1
        while (right >= 0) {
            nums1[k] = nums2[right];
            k--;
            right--;
        }
    }
}
