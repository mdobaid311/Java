/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author mdoba
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int temp=A[0];
        for(int i=0;i<A.length-1;i++){
            A[i]=A[i+1];
        }
        A[A.length-1] = temp;
        for(int x : A){
            System.out.print(x+" ");
        }
        }
}
