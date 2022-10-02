
package conditional.statements;

import java.util.Scanner;

public class ConditionalStatements {


    public static void main(String[] args) {
        websiteType();
    }
    
    
    public static void websiteType(){
       Scanner sc = new Scanner(System.in);
        String webaddress = sc.nextLine(); 
        String protocol =webaddress.split(":")[0 ] ;
        String domain= webaddress.substring(webaddress.lastIndexOf(".")+1);
        
        if("http".equals(protocol)){
            System.out.println("Hyper text transfer protocol");
        }else{
            System.out.println("File transfer protocol");
        }
        switch(domain){
            case "biz" -> System.out.println("business website");
            case "com" -> System.out.println("commercial website");
            case "org" -> System.out.println("organisational website");
            case "edu" -> System.out.println("educational website");
            case "net" -> System.out.println("network website");
            case "in" -> System.out.println("Indian website");
            case "" -> System.out.println("Unknown domain");
        }
    }
    
    public static void dayNumber(){
       Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt(); 
        switch(dayNumber){
            case 1 -> System.out.println("It is monday");
            case 2 -> System.out.println("It is tuesday");
            case 3 -> System.out.println("It is wednesday");
            case 4 -> System.out.println("It is thursday");
            case 5 -> System.out.println("It is friday");
            case 6 -> System.out.println("It is saturday");
            case 7 -> System.out.println("It is sunday");
        }
    }
    
    
    public static void leapYear(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It is a leap year");
                }else{
                    System.out.println("It is not a leap year");
                }
            }else{
                System.out.println("It is a leap year");
            }
        }else{
            System.out.println("It is not a leap year");
        }
        
        
    }
    
    public void numberType(){
                Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Binary radix-2");
        }else if(num.matches("[0-7]+")){
            System.out.println("Octal radix-8");
        }else if(num.matches("[0-9]+")){
            System.out.println("Decimal radix-10");
        }else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexa radix-16");
        }else{
            System.out.println("Not a number");
        }
    }
}
