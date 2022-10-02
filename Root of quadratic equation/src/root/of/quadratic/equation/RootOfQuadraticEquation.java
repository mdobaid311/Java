/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package root.of.quadratic.equation;

import java.util.Scanner;

/**
 *
 * @author mdoba
 */
public class RootOfQuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                   Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Three coeffecients");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        
        double r1 = (-b + Math.sqrt((b * b)-4*a*c))/2*a;
        double r2 = (-b - Math.sqrt((b * b)-4*a*c))/2*a;
        
        System.out.println("The roots of quadratic equation are: "+r1+" "+r2);

    }
    
}
