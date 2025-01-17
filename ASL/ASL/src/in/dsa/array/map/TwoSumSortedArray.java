package in.dsa.array.map;

import java.util.HashMap;

public class TwoSumSortedArray {

	public static void main(String[] args) {

		for(int e : twoSum(new int[]{1,2,3,4,5,6,7,8},9) ){
			System.out.println(e);
		}
	}

	public static int[] twoSumSorted(int[] numbers, int target) {
		
		if (numbers == null || numbers.length == 0)
			return null;
		
		int i = 0, j = numbers.length - 1;
		
		while (i < j) {
			
			int x = numbers[i] + numbers[j];
			if (x < target) {
				++i;
			}
			else if (x > target) {
				j--;
			}
			else {
				return new int[] { i + 1, j + 1 };
			}
		}
		
		return null;
	}

	static public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
            
			int diff = target - nums[i];
            if(m.containsKey(diff)) {
                result[0] = i;
                result[1] = m.get(diff);
            
            }
            m.put(diff, i);
        }
		return result;
	}

}
