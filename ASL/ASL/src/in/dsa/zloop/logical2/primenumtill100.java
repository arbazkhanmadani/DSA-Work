package in.dsa.zloop.logical2;


public class primenumtill100{
public static void main(String[] args){
for(int n=1; n<=100; n++){

int temp=0;
for(int i = 2; i<=n-1; i++){
if(n%i==0){
temp=temp+1;
}
}
//if temp==0 it means that the 1st if blocks condition became true.

if(temp==0){
System.out.println( " The prime numbers till 100 are : "+n);
}
}
}}