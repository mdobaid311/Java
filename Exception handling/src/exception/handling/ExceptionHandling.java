package exception.handling;

public class ExceptionHandling {
    
    public static void meth1() throws Exception{
    int x =10;
    int y=0;
    if(x<=0||y<=0) throw new Exception();
    System.out.println(x*y);
    }
    public static void meth2() throws Exception{meth1();}
    public static void meth3()throws Exception{meth2();}
    

    public static void main(String[] args) {
        try{
            meth3();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
