package in.dsa.array.simple;

//Majority Element =>  Occurrence of Element > array.length/2 
public class MajorityElement {

	 public static void main(String[] args){
	 
	        int arr[] = {2,2,4,1,1,2,2};
	        findMajority(arr);
	 }
	 

	 public static void findMajority(int arr[]){
	        
		 int maxCount = 0;
	     int idx = -1; // sentinels
	        
	     for(int i = 0; i < arr.length; i++) {
	            
	    	 int count = 0;
	         for (int j = 0; j < arr.length; j++)
	                if(arr[i] == arr[j])
	                    count++;
	         
	 
	         // update maxCount if count of current element is greater
	         if (count > maxCount) {
	             
	        	 maxCount = count;
	        	 idx=i;
	        	 //we need element at this idx thats why we put i = idx 
	        	 //bcz we don't need i's last value....................idx= i;
	         }
	      }
	 
	      // if maxCount is greater than n/2 return the corresponding element
	      if (maxCount > arr.length / 2)
	          System.out.println("Majority Element : "+arr[idx]);
	      else
	         System.out.println("No Majority Element");
	    }
	 
	     
}
