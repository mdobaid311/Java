
package methods;

public class Methods {

    public static void main(String[] args) {
        System.out.println(discount(200,100,50,100));
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
    
    public static void show(int ...A){
        for(int x:A){
            System.out.println(x);
        }
    }
    
    public static int maxNum(int ...A){
        int max =Integer.MIN_VALUE;
        for(int x:A){
            if(max<x){
                max=x;
            }
        }
        return max;
    }
    
    public static int sum(int ...A){
        int sum=0;
        for(int x:A){
            sum+=x;
        }
        return sum;
    }
    
    public static double discount(int ...A){
        int sumOfNumbers=sum(A);
        if(sumOfNumbers<500){
            return sumOfNumbers*0.85;
        }else if(sumOfNumbers>=500){
            return sumOfNumbers*0.7;
        }
        return sumOfNumbers;
    }
}
