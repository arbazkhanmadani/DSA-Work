package in.dsa.array.map;

import java.util.Map;
import java.util.TreeMap;

public class CountPairOfGivenSumByMap {

	public static void main(String[] args) {
		
		int count = countPairOfSum(new int[]{1,2,3,4,5,6,7,8,9}, 10);
		System.out.println(count);
	}

	
	public static int countPairOfSum(int[] a, int sum ){
		
		Map<Integer, Integer> m = new TreeMap<>();
		int count = 0;
		for(int i = 0; i<a.length; i++){
			
			if( m.containsKey(sum - a[i]) )
				count = count + m.get(sum - a[i]); 
			
			else if( m.containsKey(a[i]) )
				m.put(a[i], m.get(a[i]+1) ); 
			
			else 
				m.put(a[i], 1); 
		
		}
		
		return count;
	}
	
}
