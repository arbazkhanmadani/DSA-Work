package in.dsa.zloop.logical2;

public class perfectnum{
public static void main(String[] args){  

// perfect num : 1+2+3 = 6 the sum of the factors of a num = to itself excluded it.

int  num = 6, sum=0;
for(int i = 1; i<num; i++){
if(num%i==0){
sum = sum+i;

}
}
if(num==sum){
 System.out.println(sum+" is a perfect number"  );
}
else{
 System.out.println(sum+" is not a perfect number"  );
}

}}