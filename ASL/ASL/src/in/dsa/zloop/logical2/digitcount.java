package in.dsa.zloop.logical2;

class Digitcount{

// Concept => number/10;;; 

public static void main(String[] args){
int num1=12345;
int i;
for(i=0; num1> 0; i++){
num1= num1/10;

}
System.out.println(i);



//by while loop 

int num2=12345;
int j =0;
while(num2 > 0 ){
num2 = num2/10;
j++;
}
System.out.println(j);
}}