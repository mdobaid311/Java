
package loop;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
      GP();
    }
    
    public stativ void fibonacci(){
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       
       
    }
    
    
    public static void GP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial term: ");
        int a = sc.nextInt();
        System.out.println("Enter the common ratiio: ");  
        int d = sc.nextInt();
        System.out.println("Enter the limit: ");
        int l = sc.nextInt();
        
        for(int i=0;i<l;i++){
            System.out.print(a+" ");
            a=a*d;
        }
    }
    
    public void AP(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter starting number");
        int number  = sc.nextInt();
        System.out.println("Enter common difference");
        int diff = sc.nextInt();
        System.out.println("Enter limit");
        int limit = sc.nextInt();
        
        for(int i=0;i<limit;i++){
            System.out.print(number+i*diff+" ");
        }
            
    }
    
}
