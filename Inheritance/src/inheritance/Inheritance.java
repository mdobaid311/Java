
package inheritance;

class Square{
    public int side;
    public Square(int side){
        this.side = side;
    }
    
    public int getArea(){
        return side*side;
    }
}

class Cuboid extends Square{
    public Cuboid(int side){
        super(side);
    }
    public int area(){
        return getArea()*side;
    }
}


public class Inheritance {
    public static void main(String[] args) {
            Cuboid c = new Cuboid(5);
            
            System.out.println(c.area());
    }
    
}
