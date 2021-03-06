import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int N, K;
		int[] B;
		Solution sol = new Solution();
		Scanner s = new Scanner(System.in);
	
		System.out.println("Array size: ");
		N = s.nextInt();
	
		int[] A = new int[N];
	
		System.out.println("Add elements of array: \n");
	
		for(int i=0; i<N; i++) {
			System.out.print("A["+i+"]: ");
			A[i]=s.nextInt();
		}
	
		System.out.println("Number of cycles: ");
		K = s.nextInt();
		
		s.close();
	

		B=sol.solution(A, K);
	
		System.out.println("Solution: \n");
		for( int x : B)
			System.out.print(x + ", ");
			
	}

	
	
}
