package in.dsa.zloop.logical2;

public class pelindromeOrreversenum{
//palindrome number =>if reverse of a num = num i,e. 121=121, 244442=244442......
// reverse num=> 1234 =4321..........


public static void main(String[] args){
int num = 121;
int temp= num; 
int rev=0;
int rem;
while(num>0){
            rem = num%10;
             rev= rev*10+rem;
num = num/10; 
}
if(temp==rev){
System.out.println(rev+" is a pelindrome number");
}
else{
System.out.println(rev+" is not a pelindrome number");
}



// reverse number : same logic as palindrome will be applied.....

int num2 = 123456789;
int temp2= num2; 
int rev2=0;
int rem2;                                 
while(num2>0){                                                                         //for(int i=0; i<=num2; i++){
rem2 = num2%10;
rev2= rev2*10+rem2;
num2= num2/10; 
}
System.out.println( "reverse of number "+ temp2+" is : "+rev2);
}}