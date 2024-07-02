package in.dsa.array.tricky;


public class IntersectionOfTwoArray {

	public static void main(String[] args) {

		int a[] = { 1, 3, 2, 3,3, 4, 5,5,5, 5, 6 ,5};
		int b[] = { 3,3,3,5,3,3,9,5,5,5,5 };
		
		intersection(a,b);
	}
 
	

	 //Function to find intersection
    static void intersection(int[] a, int[] b){
 
        int i = 0, j = 0, k = 0;
        int[] result = new int[a.length+b.length];
        
        while (i < a.length && j < b.length) {
            
        	if (a[i] < b[j])
                i++;
            else if (a[i] > b[j])
                j++;
            
            else {
            	//handling duplicate elements.......
                if (k != 0 && a[i] == result[k - 1]) {
                    i++;
                    j++;
                }
                else {
                    result[k] = a[i];
                    i++;
                    j++;
                    k++;
                }
            }
        }
        System.out.print("Intersection: ");
        for (int idx = 0; idx < k; idx++)
            System.out.print(result[idx] + " ");
        System.out.println();
    }


}
