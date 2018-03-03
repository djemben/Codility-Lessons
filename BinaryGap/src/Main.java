import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Give integer: ");
		int n = in.nextInt();
		System.out.println(Integer.toBinaryString(n));
		
		
		Solution sol = new Solution();
		
		System.out.println(sol.solution(n));
		
		

		
	}

}
