package in.dsa.string.map;
import java.util.TreeSet;
/**
 * 
 * A panagram is a sentance which every char of english alphabet.
 *
 */

public class PanagramString {

	public static void main(String[] args) {


		boolean flag = isPanagram("The quick brown fox jumps over a lazy dog");
		System.out.println(flag);
	}
	
	public static boolean isPanagram(String s){
		
		s= s.toLowerCase();
		TreeSet<Character> m = new TreeSet();

		for(char ch : s.toCharArray())
			if( ch>='a' && ch<='z' )
			  	m.add(ch);
			
	
		
	
		//26 => bcz english contains 26 letter.......
		return m.size()==26;
	}

}
