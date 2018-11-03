import java.util.*;
public class Sorting {

	void bubbleSort(int arr[]){
		int n= arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1])
				{
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	void insertion(int arr[]){
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
	
	void Selection(int arr[]){
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
	
	void printArray(int arr[]){
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting ob = new Sorting();
		Scanner s=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();
            }
		//int arr[] = {12,3,19,16,2,10,120,40,38};
	    ob.bubbleSort(arr);
	    System.out.println("The Bubble Sort");
	    ob.printArray(arr);
	    ob.insertion(arr);
	    System.out.println();
	    System.out.println("The Insertion Sort");
	    ob.printArray(arr);
	    ob.Selection(arr);
	    System.out.println();
	    System.out.println("The Selection Sort");
	    ob.printArray(arr);
    } 
		
		
}
