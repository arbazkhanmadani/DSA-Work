package in.dsa.zloop.logical2;

public class fibionaciiSeries{

public static void fibionacii(long a, long b){
long temp=0;
for(long i = 1; i<=40; i++){

System.out.println(a);
temp=a+b;
a = b;
b = temp;

}
}


public static void main(String[] args){

fibionacii(0,1);


}}