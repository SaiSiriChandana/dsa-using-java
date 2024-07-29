public class FrequencyOfArrayElements{
//Function to count the frequency of all elements from 1 to N in the array.
 public static void frequencyCount(int arr[], int N, int P)
 {
     // code here
     //pre compute
      int[] hash = new int[N];

     // Counting freq of elements within range [1, N]
     for (int i = 0; i < N; i++) {
         if (arr[i] >= 1 && arr[i] <= N) {
             hash[arr[i] - 1]++;
         }
     }

     // Modifying the original arr to store the freq
     for (int i = 0; i < N; i++) {
         arr[i] = hash[i];
     }
 }

 }