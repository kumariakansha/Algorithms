import java.util.Scanner;

public class SearchingAlgorithms {
	static int arr[];
	static int n;
	static Scanner scn=new Scanner(System.in);
	static Scanner scn1=new Scanner(System.in);

	static void inputArray(){
		System.out.println("\n Searching Operation:");
        System.out.println("\nEnter the number of Elements:");
		
	    n=scn.nextInt();
	    arr = new int[n];
	    System.out.println("\n\nEnter elements:");
	    for(int i=0;i<n;i++){
	    	arr[i]=scn.nextInt();
	    }
	}
	static String inputString(Scanner scn){
		String s = scn.nextLine();
		return s;
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
		System.out.println("\n\n3.Jump  Search");
		System.out.println("\n\n4. Interpolation  Search");
		System.out.println("\n\n5. Substring Search");
		System.out.println("\n\nEnter your option 1/2/3/4/5:");
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
	   case 3:
		   JumpSearch Jsrch= new JumpSearch();
		   SearchingAlgorithms.inputArray();
			System.out.println("\nEnter the element to be searched");
	   	    v=scn.nextInt();
	   	    scn.close();
	   	    int z= Jsrch.search(arr, n, v);
	   	    System.out.println( "The number is present at the location:" + z);
	   	    break;
	   case 4: 
		   InterpolationSearch Isearch = new InterpolationSearch();
		   SearchingAlgorithms.inputArray();
			System.out.println("\nEnter the element to be searched");
	   	    v=scn.nextInt();
	   	    scn.close();
	   	    int y=Isearch.search(arr, n, v);
	   	    System.out.println("The element is present at the location:" + (y+1));
	   	    break;
	   case 5:
		   substringSearch Ssearch = new substringSearch();
			System.out.println("\nEnter the  Input string");
			String input= "akki is there";
			System.out.println("\n\nEnter the Search string");
			 String comp = "akki is there";
			scn.close();
			Ssearch.strngComp(input, comp);
			break;
        default: System.out.println("The wrong option chosen:");
            break;
   	    
		}
       
    }
}
