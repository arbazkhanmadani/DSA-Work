package in.dsa.string.map;

import java.util.*;

import javax.net.ssl.SSLContext;

public class LastDuplicateCharString {

	public static void main(String[] args) {
		duplicateChars("Hello   This 	is javaT");
	}
	
	public static void 	duplicateChars(String str){
		
		str = str.replace(" ", "").trim().toLowerCase();
		HashMap<Character, Boolean> m = new HashMap<>();
		
		
		for(int i = 0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			if(m.get(ch)==null){
				m.put(ch,  false);
			}
			else{
				m.put(ch, true);
			}	
		}
		
		System.out.println("DLast Repeated Characher is : "+m);
	}

}
