package in.dsa.zloop.logical2;

public class armStrongNum{

	//153 = 1^3+5^3+3^3........
public static void armstrongNum(int num){
int Arm =0;
int temp;
temp = num;
while(temp>0){
    int rem=temp%10;
for(int i = 1; i<=rem; i++){
     if(i==rem){
        Arm= Arm+(i*i*i);
       }
}
temp=temp/10;
}
if(num==Arm){
System.out.println(Arm+" is a Armstrong number");
}
else{
System.out.println(Arm+" is not a Armstrong number");
}
}


public static void main(String[] args){

armstrongNum(153);


}}