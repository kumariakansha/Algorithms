import java.util.*;

public class JumpSearch {

	 int search(int arr[], int n, int v){
		int m = (int)Math.floor(Math.sqrt(n));
		int i=0;
		while(arr[Math.min(m,n)-1]<v){
			i=m;
			m=m+ (int)Math.floor(Math.sqrt(n));
			if(i>=n){
				return -1;
			}
			while(arr[i]<v){
				i++;
				if(i==Math.min(m, n))
					return -1;
			}
			if (arr[i]==v){
				return (i+1);
			}
		}
		return -1;
	}
	
}
