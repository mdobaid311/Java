package pkgstatic.and.pkgfinal;

class Car {
    int price = 100000;
    static int carPrice = 200000;

    static void show(){
        System.out.println(carPrice);
    }
    void display(){
        System.out.println(price+" "+carPrice);
    }

    static class Honda{
        static void display(){
            System.out.println("Honda city");
        }
    }
    
    void meth(){
        Honda.display();
    }
    
}

class Test{
    static{
        System.out.println("Block 1");
    }

    static{
        System.out.println("Block 2");
    }
    
}

class Test1 {
    public final void show(){
        System.out.println("Hello");
    }
}

class Test2 extends Test1{
}

public class StaticAndFinal {
    final float PI=3.1425f;

    public static void main(String[] args) {
//        System.out.println("Main");
//        Test t = new Test();
//        Car c = new Car();
//        Car.carPrice = 300000;
//        Car.show();
//        c.display();
//        c.meth();
        
     }
    

}
