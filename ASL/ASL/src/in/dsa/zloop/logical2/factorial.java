package in.dsa.zloop.logical2;

public class factorial{

	public static void main(String[] args){ 
int n = 5;
int fact = 1;
for(int i = 1; i<= n; i++){
fact = fact*i;
}
System.out.println(fact);
}
}