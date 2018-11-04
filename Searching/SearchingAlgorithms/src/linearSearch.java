
public class linearSearch {
 void search(int arr[],int v){
	 int count1=0;
	 for (int i=0;i<arr.length;i++){
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
 }

