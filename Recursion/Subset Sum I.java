// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> subsetSum = new ArrayList<>();
        func(0,0,arr,n,subsetSum);
        Collections.sort(subsetSum);
        return subsetSum;
    }
    void func(int ind,int sum,int[] arr,int n,ArrayList<Integer> subsetSum){
        if(ind==n){
            subsetSum.add(sum);
            return;
        }
        func(ind+1,sum+arr[ind],arr,n,subsetSum);
        func(ind+1,sum,arr,n,subsetSum);
    }
}
