class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
     if(arr==null||arr.size()<2) return -1;
        int large=Integer.MIN_VALUE;
        int slarge=Integer.MIN_VALUE;
        for(int nums:arr){
            if(nums>large){
                
                slarge=large;
                large=nums;
                
            }
            else if(nums!=large&&nums>slarge){
                slarge=nums;
            }
        }
       
        return slarge;
        //(slarge==Integer.MIN_VALUE)?-1:slarge;
    }
}