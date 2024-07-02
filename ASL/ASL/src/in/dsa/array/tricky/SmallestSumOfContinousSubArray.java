package in.dsa.array.tricky;

public class SmallestSumOfContinousSubArray {


    public static void main(String[] args){
         
        int arr[] = {3, -4, 2, -3, -1, 7, -5};
        System.out.print("Smallest sum: "+ smallestSumSubArray(arr));
    }
    
    
	public static int smallestSumSubArray(int arr[]){
         
        // to store the minimum value that is ending up to the current index
        int currSum = Integer.MAX_VALUE;
         
        // to store the minimum value encountered so far
        int minSum = Integer.MAX_VALUE;
         
        for (int i = 0; i < arr.length; i++){
             
            // if currSum > 0, then it could not possibly 
        	//contribute to the minimum sum further
            if (currSum > 0)
            	currSum=arr[i];
             
            else
            	currSum = currSum + arr[i];
             
            // update minSum
            minSum = Math.min(minSum,currSum);        
        }
         
        return minSum;
    }
     
}
