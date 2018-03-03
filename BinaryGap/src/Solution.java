import java.math.BigInteger;

public class Solution {
	
	
	int solution(int N) {
		
		String inputIntBinaryArray = Integer.toBinaryString(N);
		int maxGap = 0;
		int maxTmpGap = 0;
		
		for(char x: inputIntBinaryArray.toCharArray()) {
			if(x=='1') {
				if(maxGap<maxTmpGap) {
					maxGap=maxTmpGap;
				}

				maxTmpGap=0;
			}
			else
				maxTmpGap++;
			
		}
		
		return maxGap;
		
	}

}
