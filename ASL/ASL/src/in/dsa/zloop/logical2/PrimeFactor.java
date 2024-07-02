package in.dsa.zloop.logical2;

public class PrimeFactor{
    
    
    public static void main(String[] args){
        primeFactor(30);
    }
    
    
    static void primeFactor(int n){

     for(int i = 2; i<n; i++){

        if(n%i==0){
          if(isPrime(i)){

            System.out.println("The  given number "+i+" is not a prime number");
          }
        }
     }
    }
    

    
static boolean isPrime(int n){
        
        boolean flag = true;
        if(n<=1)
            return false;

        for(int i = 2; i<n; i++){
            
            if(n%i==0) {
                flag=false;
            	break;}
        }


        if(flag)return true;
        else return false;

    }
  

		
	}
    

 