
public class BubbleSort {

	void bubbleSort(int arr[]){
		
		int n= arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=1;j<n-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp= arr[j];
					arr[j]=arr[i];
					arr[j+1]=temp;
				}
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort ob = new BubbleSort();
		int arr = {12,};
		
		
		
		int arr[]={64,34,25,12,22,11,90};
	    ob.BubbleSort(arr);
	    System.out.println("Sorted Array");
	    obj.printArray(arr);
		
		
		
		
	}

}
