
package classes;

class Rectangle{
    public int length;
    public int breadth;
    
    public int getArea(){
        return length*breadth;
    }
    
    public int getPerimeter(){
        return 2*(length+breadth);
    }
}

public class Classes {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.length=10;
        r1.breadth=5;
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        Rectangle r2= new Rectangle();
        r2.length=12;
        r2.breadth=7;
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }  
}
