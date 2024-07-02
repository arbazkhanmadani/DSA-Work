package in.dsa.zloop.logical2;

public class BinaryToDecimal{

	public int Decimal(int bin){
		int rem = 0;
		int decimal = 0;
		int i =0;
		while(bin!=0){
			rem =bin%10;
			decimal = decimal+(int)Math.pow(2, i)*rem;
			bin = bin/10;    
		i++;	
		}
		return decimal;
	}

	public static void main(String[] args){
		BinaryToDecimal bd = new BinaryToDecimal();

		int result = bd.Decimal(10001);
		System.out.println(result);

		int result1 = bd.Decimal(0);
		System.out.println(result1);

		int result2 = bd.Decimal(11111);
		System.out.println(result2);
	}
}