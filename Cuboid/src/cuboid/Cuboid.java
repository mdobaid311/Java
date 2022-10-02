/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuboid;

import java.util.Scanner;

/**
 *
 * @author mdoba
 */
public class Cuboid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length breadth and height of cuboid");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height= sc.nextInt();
        
        float fb = length*height;
        float rl = breadth*height;
        float bt = length*breadth;
        
        float area = 2*(fb+rl+bt);
        
        float volume = length*breadth*height;
        
        System.out.println("The area of cuboid is: "+ area);
        System.out.println("The volume of cuboid is: "+volume);
    }
    
}
