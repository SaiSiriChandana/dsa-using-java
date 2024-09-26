class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
  
        int low = 0, high = n - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If arr[mid] is less than or equal to x, update result
            if (arr[mid] <= x) {
                result = mid;
                low = mid + 1; // Look for a larger value
            } else {
                high = mid - 1; // Look for a smaller value
            }
        }
        return result;
    }
}
    
