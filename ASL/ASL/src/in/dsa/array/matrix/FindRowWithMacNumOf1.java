package in.dsa.array.matrix;

/**
 	0 1 1 1
 	0 0 1 1
 	1 1 1 1 
 	
 	2nd row has max 1 so output=2
 **/

public class FindRowWithMacNumOf1 {

	public static void main(String[] args) {

		rowWithMacNumOf1(new int[][]{{0,1,1,1},{0,0,1,1},{1,1,1,1} });
	}
	
	public static int rowWithMacNumOf1(int[][] a){

		int maxOne = 0, count=0, count1=0;
		boolean flag = true;
		
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++){
		
				if(a[i][j]==1){
					count1++;
					flag = false;
				}
			}
			if(count1>count){
				count = count1;
				maxOne = i;
			}
		}
		
		//If there is not a single 1 in matrix.....
		if(flag)
			return -1;
		
		return maxOne;
					
	};
	

}
