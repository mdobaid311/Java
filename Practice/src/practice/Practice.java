
package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter number is decimal from: ");
           int number = sc.nextInt();
           System.out.println("Left shift number: ");
           int shift = sc.nextInt();
           System.out.println("The left shifted number is: "+(number<<shift));
                   

    }
    
}
