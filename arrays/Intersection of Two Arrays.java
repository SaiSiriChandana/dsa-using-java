class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add all ele frm nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        // Check for common elements with nums2
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num); // ensures uniqueness
            }
        }
        // Convert set to array!!
        int[] res = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            res[i++] = num;
        }

        return res;
    }
}
