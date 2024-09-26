class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int n=arr.length;
        int low=0,high=n-1;
        int result[]={-1,-1};
        while(low<=high){
            if(arr[mid]<=x){
                result[0]=mid;
                high=mid-1;
            }
            else if(!arr[mid]<=x){
                low=mid-1;
                
            }
            else if(arr[mid]>=x){
                result[1]=mid;
                low=mid-1;
            }
            else{
                high=mid+1;
            }
        }
        return result;
    }
}
