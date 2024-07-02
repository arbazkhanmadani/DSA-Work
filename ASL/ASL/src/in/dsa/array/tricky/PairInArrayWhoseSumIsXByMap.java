package in.dsa.array.tricky;
import java.util.*;

public class PairInArrayWhoseSumIsXByMap {

	public static void main(String[] args){
		
		 int arr[] =  {2,7,11,15}, x = 9;
    	 int[] pairArr  = pairs(arr, x);
    	 System.out.println("The indexes are : "+pairArr[0] + " "+pairArr[1]);
	}
	

	public static int[] pairs(int []arr, int pairSum){
		
		Map<Integer, Integer> map = new TreeMap<>();
		int[] idxArr = new int[2];
		//int idx1 = -1, idx2 = -1;
		for(int i =0; i<arr.length;i++){
			
			if( map.containsKey(pairSum - arr[i]) ){
				idxArr[0] = map.get(pairSum-arr[i]);
				idxArr[1] = i;
			}
			else{
				map.put(arr[i], i);
			}
		}
	
		return idxArr;
	}
	

}
