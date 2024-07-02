package in.dsa.string.map;

import java.util.*;

public class LeastFrequentCharByMap {

	public static void main(String[] args) {
		
		leastFrequent("aabbbbbccccdd");
	}

	
	public static void leastFrequent(String s){
	
		char carray[] =  s.replace(" ", "").toCharArray();
		Map<Character, Integer> m = new TreeMap<>();
		
		for(char ch : carray){
			
			if( m.containsKey(ch) ){
				m.put(ch, m.get(ch)+1 );
			}
			else{
				m.put(ch, 1);
			}
		}
		int min = Integer.MAX_VALUE;
		char c = ' ';
		for(Map.Entry<Character, Integer> entry : m.entrySet()){
			
			int val = entry.getValue();
			if(val<=min){
				min = Math.min(val, min);
				c = entry.getKey();
				System.out.println(min+" " +c);
			}
			
		}
	
		
		
		
	}
}
