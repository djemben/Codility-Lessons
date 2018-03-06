
public class Solution {
	
	public int solution(int[] A) {
		
		int minDiff, A1, A2=0, tmpSum;
		
		A1 = A[0];
		for(int i=1; i<=A.length-1; i++) {
			A2=A2+A[i];
		}
		
		minDiff=Math.abs((A1-A2));
		
		for(int i=1; i<A.length-1; i++) {
			A1=A1+A[i];
			A2=A2-A[i];
			tmpSum = Math.abs(A1-A2);
			if(tmpSum<minDiff) {
				minDiff=tmpSum;
			}
		}
		
		return minDiff;
	}
}
