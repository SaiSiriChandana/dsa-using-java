//Find out how many times the array has been rotated
class Solution {
    public int findKRotation(List<Integer> arr) {
        int n = arr.size(); // Corrected: should call size() method
        int low = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // If the array is already sorted in this search space:
            if (arr.get(low) <= arr.get(high)) {
                if (arr.get(low) < ans) {
                    index = low;
                    ans = arr.get(low);
                }
                break;
            }

            // If the left part is sorted:
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) < ans) {
                    index = low;
                    ans = arr.get(low);
                }

                // Eliminate the left half:
                low = mid + 1;
            } else {
                // If the right part is sorted:
                if (arr.get(mid) < ans) {
                    index = mid;
                    ans = arr.get(mid);
                }

                // Eliminate the right half:
                high = mid - 1;
            }
        }
        return index;
    }
}
