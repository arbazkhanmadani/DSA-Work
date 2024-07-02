package in.dsa.string.tricky;

public class RemoveAdjacentDuplicate {

	public static void main(String[] args) {

		removeAdjacentDuplicate("aaABbcddmp");
	}

	
	public static void removeAdjacentDuplicate(String s){
		
		char chars[] = s.toLowerCase().toCharArray();
		char prev = 0;
		int idx = 0;
		
		for(int i = 0; i<chars.length; i++){
			
			if(chars[i]!=prev){
				chars[idx++] = chars[i];
				//for Checking........
				prev = chars[i]; 
			}
		}
		
		//System.out.println(idx);//4
		//.substring(0,idx) -> getting only adjacent elem.. 
		String newStr = new String(chars).substring(0,idx);
		for(int i = 0; i<newStr.length(); i++)
			System.out.println(newStr.charAt(i));
			
			
	}

}
