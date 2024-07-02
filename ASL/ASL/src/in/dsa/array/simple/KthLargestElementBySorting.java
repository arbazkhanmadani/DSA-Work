package in.dsa.array.simple;

import java.util.*;

public class KthLargestElementBySorting {

	public static void main(String[] args) {

		int k = 3;
		kthLargestElementBySorting(new int[]{1,3,8,10,10,8,5,8,6,4,11}, k);
		//1,2,4,5,6,8,8,8,10,10,11
	}
	
	//Kth largest element means where k = 2; which means 2nd largest element
	//if k = 4; 4th largest element 
	public static void kthLargestElementBySorting(int a[], int k){
		
		/*
		This logic is failed for duplicate elements. 
		Arrays.sort(a);
		a.length-k = targetElem 
		System.out.println(a[a.length - k]);
		*/
		
		//this logic for Removing Duplicate elements. 
		TreeSet<Integer> m = new TreeSet<Integer>();
		for(int i = 0; i<a.length; i++){
			m.add(a[i]);
		}
		Object[] arr = m.toArray();
		System.out.println(m);
		System.out.println(arr[arr.length-k]);
		
		
	
	}
}



