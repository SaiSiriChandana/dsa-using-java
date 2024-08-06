class Solution
{
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        
        //traverse both arrays simul and add unique elements in asc order
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || !Union.get(Union.size() - 1).equals(arr1[i])) {
                    Union.add(arr1[i]);
                }
                i++;
            } else {
                if (Union.size() == 0 || !Union.get(Union.size() - 1).equals(arr2[j])) {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        
        // Add remaining elements of arr1
        while (i < n) {
            if (!Union.get(Union.size() - 1).equals(arr1[i])) {
                Union.add(arr1[i]);
            }
            i++;
        }
        
        // Add remaining elements of arr2
        while (j < m) {
            if (!Union.get(Union.size() - 1).equals(arr2[j])) {
                Union.add(arr2[j]);
            }
            j++;
        }
        
        return Union;
    }
}
