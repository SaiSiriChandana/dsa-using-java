class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
        long val=(long)m*k;
        int n=bloomDay.length;
        if(val>n) return -1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int low=min,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static boolean possible(int[] bloomDay,int day,int m,int k){
        int n=bloomDay.length;
        int cnt=0;
        int noOfB=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                cnt++;
            }
            else{
                noOfB+=(cnt/k);
                cnt=0;
            }
        }
        noOfB+=(cnt/k);
        return noOfB>=m;
        
    }
}
