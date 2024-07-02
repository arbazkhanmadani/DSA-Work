package in.dsa.string.map;

public class MostFrequentChar {

	public static void main(String[] args) {

		mostFequent("aaabbbbbccccd");
	}

	
	public static void mostFequent(String s){
		
		char[] carr = new char[256];
		s = s.replace(" ", "");
		for(int i = 0; i<s.length(); i++) 
			carr[s.charAt(i)]++;
		
		
		int first  = 0;
		for(int i = 0; i<carr.length; i++)
			if(carr[i]>carr[first])
				first= i;
			
		System.out.println((char)first);
	}
	
}
