class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());//iitial call with 0 index
        return ans;
    }
    private void findCombination(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(ind==arr.length){//reached till last ind
            if(target==0){//base case
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){//pick condition
            ds.add(arr[ind]);
            findCombination(ind,arr,target-arr[ind],ans,ds);//considering same ind since duplicates are allowed
            ds.remove(ds.size()-1);//when recursion comes back remove added ele

        }
        findCombination(ind+1,arr,target,ans,ds);//not pick

    }
}
