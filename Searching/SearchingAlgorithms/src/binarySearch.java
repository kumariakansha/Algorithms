
public class binarySearch {

	void search(int arr[],int v,int left,int right){
		int count1=0;
		if(right>=left){
			int mid= (right-left)/2 ;
			if(v==arr[mid]){
				count1++;
				if(count1==1)
					System.out.println("The element was found at location: " + (mid+1));
				else
					System.out.println(mid+1);
			}
			else if (arr[mid]>v){
				search(arr,v,left,mid-1);
			}
			else if(arr[mid]<v)
				search(arr,v,mid+1,right);
		}
	}
		
}
