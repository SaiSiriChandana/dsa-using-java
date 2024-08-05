class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int posnonzero=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
               nums[posnonzero]=nums[i];
               posnonzero++;
            }
        }
        for(int i=posnonzero;i<n;i++){
            nums[i]=0;
        }
    }
}