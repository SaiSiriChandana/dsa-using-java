
/*Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
 * Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.
Using Hashing
 */
import java.util.*;
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            //calculate the prefix sum till index i:
            sum += A[i];

            // if the sum = k, update the maxLen:
            if (sum == K) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - K;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
    }
    /* Longest Subarray with sum K | [Postives and Negatives]
     * Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
     *  Example 2:
        Input Format: N = 3, k = 1, array[] = {-1, 1, 1}
        Result: 3
        Explanation:
        The longest subarray with sum 1 is {-1, 1, 1}. And its length is 3.
        class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int left = 0, right = 0; // 2 pointers
        long sum = A[0];
        int maxLen = 0;
        while (right < N) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > K) {
                sum -= A[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == K) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < N) sum += A[right];
        }

        return maxLen;
    }
    }
    
     */

