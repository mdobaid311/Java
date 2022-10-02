
package regular.expressions;

import java.util.Date;

public class RegularExpressions {

    public static void main(String[] args) {
//        String str1 = "mdobaid311@hotmail.com";
//        System.out.println(str1.matches("\\w*@gmail.*"));
//        System.out.println("Username is: "+str1.split("@")[0]);
//        System.out.println("Domain name is: "+str1.split("@")[1]);
//        int b =9;
//        String binaryNumber = String.valueOf(b);
//        System.out.println("The number is binary: "+binaryNumber.matches("[01]*"));
//        System.out.println("The number is hexaDecimal: "+binaryNumber.matches("[0-9A-F]*"));
//        String date = "10/12/2000";
//        System.out.println("The date is valid? "+date.matches("[0-3][0-9]/[01][1-9]/[0-9]{4}"));
          String str = "a!b@c#1$2%3";
          System.out.println(str.replaceAll("[!@#$%]*", ""));
          System.out.println(str.replaceAll("[ ]*", ""));
          System.out.println(str.split(" ").length);
            
    }
    
}
