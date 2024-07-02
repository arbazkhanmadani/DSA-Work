package in.dsa.array.simple;

public class FindMaxElementInRotatedSortedArray {

public static void main(String[] args){
		
		int arr[] = {5, 6, 2, 3, 4};
		System.out.println("The minimum element is "+ findMax(arr));
	}

	
	public static int findMax(int []arr){
		
		int low = 0, high = arr.length-1;
		// If the array is not rotated arrange in increasing order
		if (arr[low] <= arr[high]) {
			return arr[high];
		}

		//{5, 6, 2, 3, 4};
		while (low <= high) {
			
			int mid = (low + high) / 2;
			// Check if mid is the minimum element
			if  (arr[mid-1] < arr[mid]) {
				return arr[mid-1];
			}

			//If the left half is sorted, the minimum element must be in the right half
			if(arr[mid] > arr[high]) {
				low = mid + 1;
			}

			// If the right half is sorted, the minimum element must be in the left half
			else{
				high = mid - 1;
			}
		}

		
		//If no minimum element is found, return -1
		return -1;
	}

}
