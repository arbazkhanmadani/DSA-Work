package in.dsa.string.tricky;

public class LongestSubStrWithSameChar {

	public static void main(String[] args) {
		int len = longestSubString("aabceeebeeee");
		System.out.println("the longest subStr of length "+len);
	}
	
	public static int longestSubString(String s){
		
		int temp =0 , ans=0;
		for(int i = 1; i<s.length(); i++){
			
			if(s.charAt(i)==s.charAt(i-1))
				++temp;
			else{
				ans = Math.max(ans, temp);
				temp = 1;
			}	
		}
		ans = Math.max(ans, temp);
		
		return ans;
	}
}
