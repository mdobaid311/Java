package pkgenum;
import java.io.*;
import java.util.*;

enum Dept{
    CS,IT,CIVIL,ECE;
    private Dept(){
            System.out.println("hello");
    }
}

public class Enum {
    
    public static void main(String[] args) {
        Dept d = Dept.CS;
        System.out.println(d.getClass()); 
        Dept list[] = Dept.values();
        
   }
    
}
