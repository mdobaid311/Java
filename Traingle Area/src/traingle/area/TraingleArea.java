/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traingle.area;
import java.util.Scanner;

/**
 *
 * @author mdoba
 */
public class TraingleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//        System.out.println("Enter base and height of the triangle");
//        
//        float base=sc.nextFloat();
//        float height=sc.nextFloat();
//        float area= (base*height)/2;
//        System.out.println("The area of triangle is: "+area);  
        calculateArea();
    }
    
    public static void calculateArea(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Three sides of the triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        
        float S = (a+b+c)/2f;
        
        double area = Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("The area of triangle is: "+area);
    }
}
