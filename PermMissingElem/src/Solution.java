import java.util.Arrays;

public class Solution {
	
	public int solution(int[] A) {
		
		int i;
		
		Arrays.sort(A);
		
		for(i=0; i<=A.length-1;i++) {
			if(A[i]!=i+1) {
				break;
			}
		}
		
		return i+1;
	}
}
