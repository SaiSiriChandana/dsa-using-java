/* Sort an array of 0s, 1s and 2s

Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

Examples
Input:
 nums = [2,0,2,1,1,0]
Output
: [0,0,1,1,2,2]
optimal approach:
This problem is a variation of the popular Dutch National flag algorithm
 */
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0,mid=0,high=n-1;//3 pointers
        while(mid<=high){ //mid->high is unsorted
        if(nums[mid]==0){
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            low++;
            mid++;
            } 
        else if(nums[mid] == 1) {
                mid++;
           }
        else {
                // swapping arr[mid] and arr[high]
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
               

                high--;
            
        }
        }

    }
}
