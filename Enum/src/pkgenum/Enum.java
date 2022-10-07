package pkgenum;
import java.io.*;
import java.util.*;

enum Dept{
    CS("john","Block A"),IT("john","Block B"),CIVIL("john","Block A"),ECE("john","Block A");
   String head;
   String location;
   
    private Dept(String head,String loc){
            this.head = head;
            this.location =loc;
    }
    public void display(){
        System.out.println(this.name()+" "+this.ordinal());
    }
    
    public String headName(){
        return head;
    }
    
    public String location(){
        return location;
    }
}

public class Enum {
    
    public static void main(String[] args) {
        Dept d = Dept.CS;
        System.out.println(d.getClass()); 
        Dept list[] = Dept.values();
        System.out.println(Arrays.toString(list));
        d.display();
        System.out.println(d.headName());
        System.out.println(d.location());
   }
    
}
