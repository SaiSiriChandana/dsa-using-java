class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    private void findCombinations(int ind,int[] arr,int target, List<List<Integer>> ans, List<Integer> ds){
        if(target==0){//base case
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind&&arr[i]==arr[i-1]) continue;//if same element continue also i>ind implies if one ele is chosen as 1st ele no need to select the same valued ele as first agaian
            if(arr[i]>target) break;//not a valid comb
            ds.add(arr[i]);
            findCombinations(i+1,arr,target-arr[i],ans,ds);//go to next index
            ds.remove(ds.size()-1);//remove element when recursion comes back

        }
    }
}
