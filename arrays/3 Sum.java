/*class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=0&&nums[i]==nums[i-1]) continue;//remove dup
            //2 ptrs
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k&&nums[j]==nums[j-1]) j++;
                    while(j<k&&nums[k]==nums[k+1]) k--;
                }
            }

        }
        return ans;

        
    }
}
Arrays.asList(nums[i], nums[j], nums[k]) creates a list with the selected elements from nums.
temp stores this list.
ans.add(temp) adds this list to list ans, which is being used to store multiple such lists->final ans which will be returned.*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);//step1-sort the given arr
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue; //skip dups values for i
            int left=i+1;
            int right=n-1;
            //step2-2 pointer search for 2 nos that sum with nums[i] to 0
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if (sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //skip dups on left and right
                    while(left<right&&nums[left]==nums[left+1]) left++;
                    while(left<right&&nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }else if(sum<0){
                    left++;//need bigger number so move left ptr to one step forward
                }else{
                    right--;//need smaller number so move right ptr to one step backward
                }
            }



        }
        return ans;
        
    }
}
