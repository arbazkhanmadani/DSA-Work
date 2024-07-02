package in.dsa.array.simple;

public class SumOfTriplateOFArray {

	
	public static void main(String[] args){
    	
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        findTriplate(A, sum);
    }
	 
	
	public static void findTriplate(int A[], int sum ){
	        
		for (int i = 0; i < A.length- 2; i++) {
	 
	        // Fix the second element as A[j]
	        for (int j = i + 1; j < A.length - 1; j++) {
	 
	            // Now look for the third number
	            for (int k = j + 1; k < A.length; k++) {
	                	
	                if (A[i] + A[j] + A[k] == sum) {
	                   System.out.println("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
	                }
	            }
	        }
		}  

	}
	 
	    
}
