package pkgenum;

enum Dept{
    CS,IT,CIVIL,ECE
}

public class Enum {
    
    public static void main(String[] args) {
        Dept d = Dept.CS;
        System.out.println(d.getClass()); 
   }
    
}
