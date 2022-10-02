/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwise;

/**
 *
 * @author mdoba
 */
public class Bitwise {

    public static void main(String[] args) {
             int a =10,b=15;
             a=a^b;
             b=a^b;
             a=a^b;
             System.out.println(a+" "+b);
//             Store two numbers in a single number 
            byte c;
            c= (byte)(9<<4);
            c=(byte)(c|12);
            System.out.println((c&0b11110000)>>4);
            System.out.println((c&0b00001111))
                    ;
    }
    
}
