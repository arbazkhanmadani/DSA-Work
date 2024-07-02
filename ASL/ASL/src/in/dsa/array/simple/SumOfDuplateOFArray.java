package in.dsa.array.simple;

public class SumOfDuplateOFArray {

	

	public static void main(String[] args){
    	
        int A[] = { 1, 4, 45, 6, 10, 8,2 };
        int sum = 10;
        findDuplate(A, sum);
    }
	 
	
	public static void findDuplate(int A[], int sum ){
	     
		for (int i = 0; i < A.length- 1; i++) {
	 
	        // Fix the second element as A[j]
	        for (int j = i + 1; j < A.length; j++) {
	
	            if (A[i] + A[j] == sum) {
	               System.out.println("duplate is " + A[i] + ", " + A[j]);
	            }
	        }
	    }
	 
	}
	 

}
