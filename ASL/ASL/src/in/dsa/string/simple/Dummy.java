package in.dsa.string.simple;

public class Dummy {

	public static void main(String[] args) {
		
		String s="aaabaaaa", s1="";
		for(int i =0; i<s.length()-2;i=i+2){

            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)){
                s1 += s.charAt(i+1)+""+s.charAt(i+2);
               System.out.println(s.substring(0, 1)+"========="); 
                
            }
            else
            	s1+=s.charAt(i);
            System.out.println(s1); 
        }

		//System.out.println(s);
	}

}
