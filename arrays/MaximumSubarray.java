/* Kadane's Algorithm : Maximum Subarray Sum in an Array

Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.

Examples
Example 1:
Input:
 arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output:
 6 

Explanation:
 [4,-1,2,1] has the largest sum = 6. 
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int tempSum=0;
        for(int i=0;i<nums.length;i++){
            tempSum=tempSum+nums[i];
            if(tempSum>maxSum){
            maxSum=tempSum;
        }
        if(tempSum<0){
            tempSum=0;
        }
        }
         return maxSum;
    }
   
}
