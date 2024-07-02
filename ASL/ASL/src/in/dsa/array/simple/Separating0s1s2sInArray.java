package in.dsa.array.simple;

class Separating0s1s2sInArray {

	//Sort the array in this form{0, 1, 2}
	static void sortZerosOnesAndTwos(int a[]){
		
		int lo = 0, mid = 0, hi = a.length - 1, temp = 0;
		
		// Iterate till all the elements are sorted
		//0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1
		while (mid <= hi) {
				
			//If the element is 0
			if(a[mid]==0){
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
			}
			//If the element is 1
			else if(a[mid]==1){
				mid++;
			}
			//If the element is 2
			else{
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
			}
		}
		
	}

	public static void main(String[] args){
		
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sortZerosOnesAndTwos(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	
	}
}
