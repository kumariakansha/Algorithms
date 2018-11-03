
public class QuickSort {
	int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<pivot){
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;	
			}	
		}
		
		
		int temp= arr[i+1];
		arr[i+1]=pivot;
		arr[high]=temp;
		
		return i+1;
	}
	void sort(int arr[],int low,int high){
		if(low<high){
			int index = partition(arr,low,high);
			sort(arr,low,index-1);
			sort(arr,index+1,high);
			
		}
	}


}
