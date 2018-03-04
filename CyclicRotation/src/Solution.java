
public class Solution {

	public int[] solution(int[] A, int N, int K) {
		
		int tmp;
		
		for(int i=0; i<K%N; i++) {
			tmp=A[(A.length-1)];
			for(int j = A.length-1; j>0; j--) {
				A[j]=A[j-1];
			}
			A[0]=tmp;
		}
		
		return A;
	}
	
}
