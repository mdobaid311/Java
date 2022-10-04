package inner.pkgclass;

abstract class My{
    abstract public void show();
}

class OuterClass{
    
    public int x=10;
    InnerClass ic = new InnerClass();
    
    class InnerClass{
        public void displayInner(){
            int y =20;
            System.out.println(x+" "+y);
        }
    }
    public void displayOuter(){
        ic.displayInner();
        System.out.println("outer display");
    }
}

class Outer1{
    public void display(){
        My m = new My(){
            @Override
            public void show(){
                System.out.println("show");
            }
        };
        m.show(); 
    }
}

class Outer{
    int x =10;
    static int y =20;
    static class My{
     static void show(){
        System.out.println(y);
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        Outer.My m= new Outer.My();
        Outer.My.show();
    }
    
}
