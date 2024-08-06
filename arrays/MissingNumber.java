class Solution {
    public int missingNumber(int[] nums) {
       int N=nums.length;
       int sum = (N * (N + 1)) / 2;

        //Summation of all array elements
        int s2 = 0;
        for (int i = 0; i < N; i++) {
            s2 += nums[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }
}