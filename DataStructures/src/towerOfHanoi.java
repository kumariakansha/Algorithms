 
public class towerOfHanoi {
	static void tower(int n, char from_rod,char to_rod, char aux_rod){
		if(n==1){
			System.out.println("Move Disc 1 from rod " + from_rod + " to rod " + to_rod);
			return;
		}
		tower(n-1,from_rod,aux_rod,to_rod);
		System.out.println("Move Disc " + n + " from rod " + from_rod + " to rod " + to_rod);
		tower(n-1,aux_rod,to_rod,from_rod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		tower(n,'A', 'C','B');
	}

}
