class Solution {
    public int findPairs(int[] nums, int k) {
    if (k < 0) return 0; // Difference cannot be negative
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
    if(!mp.containsKey(nums[i])){
        mp.put(nums[i],1);
    }
    else{
        mp.put(nums[i], mp.get(nums[i]) + 1);
        }
    }
    int count=0;
    for(int i:mp.keySet()){
    if(k==0){ //edge case
        if(mp.get(i)>1){
            count++;
            
        }
    }
    
    else{
        if(mp.containsKey(i+k)){
        count++;
        }
    }

    }
    return count;
    }
}
