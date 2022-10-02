
package loops;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {
            diamond();
    }
    
    public static void table(){
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number for multiplication table");
        int number = sc .nextInt();
        
        for(int i=1;i<10;i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
    
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of numbers to be added");
        
        int number = sc.nextInt();
        
        int sum = 0;
        
        for(int i=0;i<number;i++){
            int num = sc.nextInt();
            sum+=num;
        }
        
        System.out.println("The sum of numbers is:"+sum);
    }
    
    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int factorial =1;
        for(int i=number;i>0;i--){
            factorial*=i;
        }
        System.out.println("The factorial of number is: "+factorial);
    }
    
    public static void digits(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int number =num;
        int count=0;
        int reversedNumber=0;
        int armstrongSum=0;
        while(number>0){
            int digit=number%10;
            count++;
            armstrongSum+=Math.pow(digit, 3);
            reversedNumber=reversedNumber*10+digit;
            System.out.println("The digit of the number is: "+digit);
            number=number/10;
        }
        System.out.println("The number of digits in the number is: "+count);
        System.out.println("The reverse of the number is: "+reversedNumber);
        
        if(armstrongSum==num){
            System.out.println("The number is armstrong");
        }else{
            System.out.println("The number is not armstrong");
        }
        
        if(reversedNumber==num){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
    }
    
    public static void diamond(){
               for(int i=1;i<5;i++)
            {
                for(int j=1;j<5;j++)
                {
                    if(i+j>5)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println("");
            }
    }
    
    
}
