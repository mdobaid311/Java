package inner.pkgclass;

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

public class InnerClass {

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.displayOuter();
    }
    
}
