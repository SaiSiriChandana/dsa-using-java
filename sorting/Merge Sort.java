class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int leftlen = m - l + 1;
         int rightlen = r - m;

         int[] left = new int[leftlen];
         int[] right = new int[rightlen];

         // Copy data to temp arrays
         for (int i = 0; i < leftlen; i++) {
             left[i] = arr[l + i];
         }
         for (int i = 0; i < rightlen; i++) {
             right[i] = arr[m + 1 + i];
         }

         // Merge the temp arrays
         int i = 0, j = 0, k = l;
         while (i < leftlen && j < rightlen) {
             if (left[i] <= right[j]) {
                 arr[k] = left[i];
                 i++;
             } else {
                 arr[k] = right[j];
                 j++;
             }
             k++;
         }

         // Copy remaining elements of left[], if any
         while (i < leftlen) {
             arr[k] = left[i];
             i++;
             k++;
         }

         // Copy remaining elements of right[], if any
         while (j < rightlen) {
             arr[k] = right[j];
             j++;
             k++;
         }
    }
    
    void mergeSort(int arr[], int l, int r)
    {
        //code here
       if(l>r){
           return;
       }
       if(l==r){
           return;
       }
       int mid=(l+r)/2;
       mergeSort(arr,l,mid);
       mergeSort(arr,mid+1,r);
       merge(arr,l,mid,r);
    }
}
