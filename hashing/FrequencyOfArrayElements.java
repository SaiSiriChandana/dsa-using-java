class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        //pre-compute
        int hash[]=new int[N];
        for(int i=0;i<N;i++){
            if(arr[i]>=1&&arr[i]<=P){
                hash[arr[i]-1]++;
            }
        }
        //orginal arr is now modified to store pre computed frequencies
        for(int i=0;i<N;i++){
            arr[i]=hash[i];
        }
    }
}
