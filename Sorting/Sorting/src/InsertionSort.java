
public class InsertionSort {
	void insertionSort(int arr[]){
		int temp;
		int n=arr.length;
        for (int i = 1; i < n; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
	void recursiveInsertionSort(int arr[],int n){
		if(n==1)
			return ;
		recursiveInsertionSort(arr,n-1);
		int last=arr[n-1];
		int j= n-2;
		while(j>=0 && arr[j]>last){
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=last;
	}




}
