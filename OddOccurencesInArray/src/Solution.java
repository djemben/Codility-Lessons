import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int solution(int[] A) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int oddValueOfArray=-1;
		
		for( int x: A) {
			if(!map.containsKey(x)) {
				map.put(x, 1);
			}
			else {
				map.put(x,map.get(x)+1);
			}
		}
		
		Collection<Integer> keys = map.keySet();
		for( int x : keys) {
			if(map.get(x)%2==1) {
				oddValueOfArray=x;
			}
							
		}
		
		return oddValueOfArray;
		
	}
}
