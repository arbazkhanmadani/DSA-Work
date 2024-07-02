package in.dsa.array.map;

public class DuplicateElement {

	public static void main(String[] args) {

		duplicateElements(new int[]{1,2,3,3,3,3,5,3,4,2,6,4,3,2,2,2});
		
	}
	
	public static void duplicateElements(int []arr){
		
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			
			for(int j = 0; j<i; j++){
				
				if(arr[i]==arr[j]){
					count++;
					System.out.println(arr[i]+" "+count);
					
				}
			}	
			
			count = 0;
		}
	}

}
