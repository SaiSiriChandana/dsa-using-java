/* Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
 * Example 1:
Input Format:
 arr[] = {2,2,1}
Result:
 1
Explanation:
 In this array, only the element 1 appear once and so it is the answer.
Optimal Approach(Using XOR): 

Two important properties of XOR are the following:

XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2
So, if we perform the XOR of all the numbers of the array elements, we will be left with a single number.
 */
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }
}