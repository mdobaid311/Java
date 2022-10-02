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
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,0,0},{0,1,0},{0,0,1}};
        
        matrixMultiplication(A, B);
    }
    
    public static void matrixMultiplication(int A[][],int B[][]){
      int C[][]=new int[3][3];
          for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=0;
                for(int k=0;k<3;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];                    
                }
            }
        }
          for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  System.out.print(C[i][j]);
              }
              System.out.println("");
          }
    }
    
    public void matrixAddition(int A[][],int B[][]){
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(A[i][j]+B[i][j]);
            }
            System.out.println("");
        }
    }
    
    public void matrixSubtraction(){
        
    }
}
