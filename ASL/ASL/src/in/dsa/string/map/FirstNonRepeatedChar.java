package in.dsa.string.map;

import java.util.Map;
import java.util.HashMap;
class FirstNonRepeatedChar {

	public static void main(String[] args) {
		
		firstNonRepeated("aabbrccdeff");
	}

	
	public static void firstNonRepeated(String s){
	
		char carray[] =  s.replace(" ", "").toCharArray();
		Map<Character, Integer> m = new HashMap<>();
		
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
				if(entry.getValue()==1){
				firstNonRep = entry.getKey();
				break;
			}
		}
		System.out.println(firstNonRep);
		System.out.println(m);
		
	}

}