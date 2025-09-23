class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr={-1,-1,-1};
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']=i;
            if(arr[0]!=-1&&arr[1]!=-1&&arr[2]!=-1){
                int minIndex=Math.min(arr[0],Math.min(arr[1],arr[2]));
                cnt+=minIndex+1;
            }
        }
        return cnt;
    }
}
