import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int f = findFloor(a, n, x);
        int c = findCeil(a, n, x);
        return new int[] {f, c};
    }
    static int findFloor(int[] a, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] <= x) {
                ans = a[mid];// maybe the answer
                low = mid + 1;//look for smaller index on the left
            } else {
                high = mid - 1; // look on the right
            }
        }
        return ans;
    }

    static int findCeil(int[] a, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (a[mid] >= x) {
                ans = a[mid];// maybe the answer
                high = mid - 1;//look for smaller index on the left
            } else {
                low = mid + 1; // look on right
            }
        }
        return ans;
    }
    
}
