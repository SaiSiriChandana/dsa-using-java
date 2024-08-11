/* Find the Majority Element that occurs more than N/2 times

Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

Examples
Example 1:
Input Format
: N = 3, nums[] = {3,2,3}
Result
: 3
Explanation
: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution.
Optimal Approach: Moore’s Voting Algorithm:  */
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0,el=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }
            else if(el==nums[i]) cnt++;
            else cnt--;
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el) cnt1++;
        }
        if(cnt1>(n/2)) return el;
        return -1;
    }
}
