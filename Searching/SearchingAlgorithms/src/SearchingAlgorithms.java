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
	static void search(){
		System.out.println("\nEnter the element to be searched");
		int v=scn.nextInt();
	    
		scn.close();
	
		int count1=0;
		for (int i=0;i<n;i++){
			if(arr[i]==v){
				count1++;
				if(count1 == 1){
					System.out.println("\nElement Present at Locations:\n" + (i+1));
				}
				else{
					System.out.println(i+1);
				}
			}
		}
		if(count1==0){
			System.out.println("\nThe element is not present at any locations");
		}
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        
        SearchingAlgorithms.inputArray();
        SearchingAlgorithms.printArray();
        SearchingAlgorithms.search();
        }
	}
