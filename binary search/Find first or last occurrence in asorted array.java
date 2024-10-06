class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=firstPos(nums,n,target);
        if(first==-1) return new int[] {-1,-1};
        int last=lastPos(nums,n,target);
        return new int[] {first,last};
    }
    public static int firstPos(int[] nums,int n,int target){
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;

            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    public static int lastPos(int[] nums,int n,int target){
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }

}
