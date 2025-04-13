class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(sumofD(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    private int sumofD(int[] nums, int divisor){
         int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / divisor);
        }
        return sum;
    }
}
