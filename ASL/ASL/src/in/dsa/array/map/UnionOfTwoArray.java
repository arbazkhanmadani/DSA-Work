package in.dsa.array.map;

import java.util.*;

public class UnionOfTwoArray {

	public static void main(String[] args) {

		int a[] = { 1, 3, 2, 3,3, 4, 5,5,5, 5, 6 ,5};
		int b[] = { 3,3,3,5,3,3,9,5,5,5,5 };
		
		Object[] un = union(a, b);
		for(Object ob : un)
			System.out.println(ob);
	}
	
	
	public static Object[] union(int a[], int b[]){
		
		Set<Integer> s = new HashSet();
		
		for(int i =0; i<a.length; i++){
			s.add(a[i]);
		}
		for(int i =0; i<b.length; i++){
			s.add(b[i]);
		}
		
		//System.out.print(s);
		
		return s.toArray();
	}
}
