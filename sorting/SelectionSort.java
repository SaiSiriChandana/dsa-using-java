class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        //select method should return min element's index
        int min=i;
        for(int j=i;j<=arr.length-1;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    //this method uses min index from select method and sorts the arr
	    for(int i=0;i<=n-2;i++){
	        int mini=select(arr,i);
	        int temp=arr[mini];
	        arr[mini]=arr[i];
	        arr[i]=temp;
	    }
	}
}
