import java.util.Scanner;

public class SearchingAlgorithms {
	static int arr[];
	static int n;
	static Scanner scn=new Scanner(System.in);
	static void inputArray(){
		System.out.println("\nLinear Search:");
        System.out.println("\nEnter the number of Elements:");
		
	    n=scn.nextInt();
	    arr = new int[n];
	    System.out.println("\n\nEnter elements:");
	    for(int i=0;i<n;i++){
	    	arr[i]=scn.nextInt();
	    }
	}
	static void printArray(){
		System.out.println("\n\nArray:");
        for (int i=0; i<n; ++i) 
            System.out.println(arr[i]);
	}		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("\n\nSearching Algorithms");
		System.out.println("\n\n1.Linear Search");
		System.out.println("\n\n2.Binary Search");
		System.out.println("\n\nEnter your option 1/2:");
		int c= scn.nextInt();
		int v=0;
		switch(c){
		case 1:
			
			linearSearch srch= new linearSearch();
			SearchingAlgorithms.inputArray();
			System.out.println("\nEnter the element to be searched");
	   	    v=scn.nextInt();
	   	    scn.close();
			srch.search(arr, v);
			break;
		case 2:
			
			binarySearch bsrch = new binarySearch();
			SearchingAlgorithms.inputArray();
			System.out.println("\nEnter the element to be searched");
	   	    v=scn.nextInt();
	   	    scn.close();
	   	    bsrch.search(arr,v,0,n-1);
	   	    break;
        default: System.out.println("The wrong option chosen:");
            break;
   	    
		}
       
    }
}
