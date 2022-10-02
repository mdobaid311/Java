
package methods;

public class Methods {

    public static void main(String[] args) {
        System.out.println(GCD(35,56));   
    }
    
    public static boolean isPrime(int num){
        
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static int GCD(int x,int y){
        while(x!=y){
            if(x>y){
                x=x-y;
            }else{
                y=y-x;
            }
        }
        return x;
    }
}
