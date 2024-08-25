class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int posnonzero=0;
        //non zero elements to the beginning of the array
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
               nums[posnonzero]=nums[i];
               posnonzero++;
            }
        }
        //fill the rest of the array with zeroes
        for(int i=posnonzero;i<n;i++){
            nums[i]=0;
        }
    }
}
