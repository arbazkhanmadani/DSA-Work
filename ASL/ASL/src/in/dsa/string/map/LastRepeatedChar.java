package in.dsa.string.map;

import java.util.Map;
import java.util.TreeMap;

public class LastRepeatedChar {

	
	public static void main(String[] args) {
		lastRepeated("abbbccddefrff");
	}

	public static void lastRepeated(String s){
	
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
		
		char firstNonRep = ' ';
		for(Map.Entry<Character, Integer> entry : m.entrySet()){
				if(entry.getValue()>1){
				firstNonRep = entry.getKey();
				System.out.println(firstNonRep);
				
			}
		}
		System.out.println(firstNonRep);
		System.out.println(m);
		
	}

}
