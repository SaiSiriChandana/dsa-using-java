class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1); // Ensure nums1 is smaller
        }

        int m = nums1.length, n = nums2.length;
        int l = (m + n + 1) / 2; // Left partition size
        int lo = 0, hi = m;

        while (lo <= hi) {
            int i = (lo + hi) / 2; // Partition index for nums1
            int j = l - i;         // Partition index for nums2

            int la = (i > 0) ? nums1[i - 1] : Integer.MIN_VALUE;
            int ra = (i < m) ? nums1[i] : Integer.MAX_VALUE;
            int lb = (j > 0) ? nums2[j - 1] : Integer.MIN_VALUE;
            int rb = (j < n) ? nums2[j] : Integer.MAX_VALUE;

            if (la <= rb && lb <= ra) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(la, lb) + Math.min(ra, rb)) / 2.0;
                } else {
                    return Math.max(la, lb);
                }
            } else if (la > rb) {
                hi = i - 1; // Move left
            } else {
                lo = i + 1; // Move right
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted!");
    }
}
