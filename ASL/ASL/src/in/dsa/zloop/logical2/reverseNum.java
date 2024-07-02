package in.dsa.zloop.logical2;

public class reverseNum{

public static void reverse(int a){
for(int i =0; a>0 ;a/=10){               
       int rem =a%10;
       System.out.print(rem);
  }
}

public static void main(String[] args){
reverse(12345);

}}