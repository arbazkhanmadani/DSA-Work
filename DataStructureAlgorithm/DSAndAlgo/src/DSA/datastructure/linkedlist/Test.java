package DSA.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		int[] a = {2,3,5,6,9};
		
		int[] n = sum(a, 8);
		for(int i=0; i<n.length; i++)
			System.out.println(n[i]);
	}
	
	
	public static int[] sum(int[] a, int t) {
		
		int n[] = new int[a.length];
			
		int k=0,l=1;
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				
				if(a[i]+a[j]==t){
					n[k]=i;
					n[l]=j;
					k = k+2;
					l = 1+2;
					break;
				}
			}
		}
		
		
		
		if(n.length>0)return n;
		else return null;
    }

}
