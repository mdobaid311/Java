
package strings;
public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = new String("Hello");
        
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3));
    }
    
}
