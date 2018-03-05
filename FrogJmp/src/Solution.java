
public class Solution {
	public int solution(int X, int Y, int D) {
		
		int i;
		
		i=(Y-X)/D;
		
		if((Y-X)%D==0)
			return i;
		else
			return i+1;
		
	}
}
