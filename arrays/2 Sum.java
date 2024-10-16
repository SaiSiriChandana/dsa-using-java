/* Two Sum : Check if a pair with given sum exists in Array

Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

Examples:

Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.
Better Approach(using Hashing): 
Optimized Approach(using two-pointer): suitable when we have to solve it without using Map and for variant 1
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] a=new int[2];
        a[0]=-1;a[1]=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return a;
        
    }
}
