/* Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.*/
/*Input: n = 6, arr[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.*/
class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> ans= new ArrayList<>();
        int max=arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
        
    }
}
