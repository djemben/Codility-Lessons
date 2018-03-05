
public class Solution {

	@SuppressWarnings("finally")
	public int[] solution(int[] A, int K) {
		
		int tmp;
		
		try {
			for(int i=0; i<K%A.length; i++) {
				tmp=A[(A.length-1)];
			for(int j = A.length-1; j>0; j--) {
				A[j]=A[j-1];
			}
			A[0]=tmp;			
			}
		}catch(NullPointerException e) {
			System.out.println("Array is empty. Do nothing.");
		}finally {
			return A;
		}
		
	}
	
}
