package Package4;
import Package1.Class1;
import Package1.Class2;
import Package2.Class3;
import Package2.Package3.Class4;

public class Main {
    public static void main(String args[]){
        System.out.println("Hello world");
        Class1 c1 = new Class1();
        Class1 c2 = new Class1();
        Class2 c3 = new Class2();
        Class2 c4 = new Class2();
        
        c1.display1();
        c2.display1();
        c3.display2();
        c3.display2();
        c4.display2();
        Class3.display3();
        
    }
}
