import java.util.*;

public class Sorting {	
	
	void printArray(int arr[]){
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting ob = new Sorting();
		
		Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("\n\nEnter elements:");
        
        //for reading array
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        /************************
        *    1. Bubble Sort
        ************************/
        BubbleSort bubble = new BubbleSort();
        //bubble.bubbleSort(arr);
	    System.out.println("\n\nThe Bubble Sort:");
	    ob.printArray(arr);
	    
	    
	    /************************
        *    2. Recursive Bubble Sort
        ************************/
	    //bubble.recursiveBubbleSort(arr,n);
	    System.out.println("\n\nThe recursive Bubble Sort:");
	    ob.printArray(arr);
	    

	    /************************
        *    3. Insertion Sort
        ************************/
	    InsertionSort insertion = new InsertionSort();
	    //insertion.insertionSort(arr);
	    System.out.println("\n\nThe Insertion Sort:");
	    ob.printArray(arr);

	    
	    /************************
        *    4. Recursive Insertion Sort
        ************************/
	    //insertion.recursiveInsertionSort(arr,n);
	    System.out.println("\n\nThe  Recursive Insertion Sort:");
	    ob.printArray(arr);
	    /************************
        *    5. Selection Sort
        ************************/
	    SelectionSort selection = new SelectionSort();
	    //selection.selectionSort(arr);
	    System.out.println("\n\nThe Selection Sort:");
	    ob.printArray(arr);
	    
	    MergeSort mergesort = new MergeSort();
	    mergesort.sort(arr, 0, n-1);
	    System.out.println("\n\nThe Merge Sort:");
	    ob.printArray(arr);
	    
	    
	    
	
	}	
}
