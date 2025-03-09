class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find the maximum pile size
        int maxEl = Integer.MIN_VALUE;
        for(int p:piles){
            maxEl=Math.max(maxEl,p);
        }
        int low=1,high=maxEl;
        // Binary search to find the minimum eating speed
        while(low<=high){
            int mid=low+(high-low)/2;
            int totHrs=calcTotHrs(piles,mid);
            if(totHrs<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private int calcTotHrs(int[] piles,int hourly){
        int totHrs=0;
        for(int p:piles){
            totHrs+=Math.ceil((double)p/hourly);
        }
        return totHrs;
    }
}
