package in.dsa.zloop.logical2;

public class DecimalToBinary{

public void Binary(int dec){
int arr[] = new int[1000];
int rem=0;
int temp = dec;
int i = 0;
while(dec>0){
     arr[i] = dec%2;
         
dec = dec/2;   
i++;
}

for(int j=i-1; j>=0; j--){

       System.out.print(arr[j]);
}
}
public static void main(String[] args){

DecimalToBinary db = new DecimalToBinary();

db.Binary(8);
}}