import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.*;

public class Solution {


		public static void main(String[] args) {
			int[] arr = topKFrequent(new int[]{1,1,1,1,1,1,2,2,3,3,3,3},2);
			
			for(int i : arr)
				System.out.println(i);
		}
		
	    static public int[] topKFrequent(int[] nums, int k) {
	        
	        if(nums.length==1)
	            return nums;

	        Comparator<Integer> byName = (o1,o2)->o2-o1;
	        TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>(byName);

	        for(int e : nums){
	            int abs = Math.abs(e);
	            if(m.containsKey(abs))
	                m.put(e, m.get(abs)+1);
	            else
	            m.put(e,1);
	        }

	        
			int[] arr = new int[k];
	        int i=0;
			System.out.println(m);
	        for(Map.Entry<Integer, Integer> ent : m.entrySet()){
	        	
	        	if(i==arr.length)
	        		break;
	        	
	        	arr[i++] = ent.getValue();
	        
	        }
	        return arr;
	    }
}
