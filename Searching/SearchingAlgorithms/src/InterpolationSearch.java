
public class InterpolationSearch {
	int search(int arr[], int n , int v){
		int low=0,high=n-1,pos=0;
		while(low<=high && arr[low]<= v && arr[high]>=v)
		{
			pos= low+(((high-low)/(arr[high]-arr[low]))*(v-arr[low]));
			if(arr[pos]==v){
				return (pos);
			}
			if(arr[pos]<v)
				low=pos+1;
			else
				high=pos-1;
		}
		return -1;
	}
}

