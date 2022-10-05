
package strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for(int i=0;i<=str.length();i++){
            System.out.println(str.substring(0, i));
        }
        for(int i=str.length()-1;i>0;i--){
            System.out.println(str.substring(0, i));
        }
    }
    
}
