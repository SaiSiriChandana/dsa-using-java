public class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        // Sort the intervals by their start times
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        // Initialize the array to store merged intervals
        int[][] ans = new int[n][2];
        int index = 0; // To track the number of merged intervals

        for (int i = 0; i < n; i++) {
            // If the current interval doesn't overlap with the last interval in ans
            if (index == 0 || intervals[i][0] > ans[index - 1][1]) {
                ans[index][0] = intervals[i][0];
                ans[index][1] = intervals[i][1];
                index++;
            }
            // If the current interval overlaps with the last interval in ans
            else {
                ans[index - 1][1] = Math.max(ans[index - 1][1], intervals[i][1]);
            }
        }

        // Return the merged intervals up to the index
        return Arrays.copyOf(ans, index);
    }
}
