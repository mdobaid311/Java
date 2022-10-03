
package classes;

class Rectangle{
    public int length;
    public int breadth;
    
    public Rectangle(){
        length=1;
        breadth=1;
    }
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    
    public int getArea(){
        return length*breadth;
    }
    
    public int getPerimeter(){
        return 2*(length+breadth);
    }
}

public class Classes {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(10,6);
        
        System.out.println(r1.getArea());
        
    }
}
