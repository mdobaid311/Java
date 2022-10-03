package pkgabstract.classes;

abstract class Shape{
    abstract int perimeter();
    abstract int area();
}

class Square extends Shape{
    int side;
    public Square(int side){
        this.side = side;
    }
    
    @Override
    public int perimeter(){
        return 2*(side+side);
    }
    
    @Override
    public int area(){
        return side*side;
    }
}

class Rectangle extends Shape{
    int length,breadth;
    public Rectangle(int length,int breadth){
        this.length= length;
        this.breadth= breadth;
    }
    
    @Override
    public int perimeter(){
        return 2*(length+breadth);
    }
    
    @Override
    public int area(){
        return length*breadth;
    }
}

public class AbstractClasses {

    public static void main(String[] args) {

    }
    
}
