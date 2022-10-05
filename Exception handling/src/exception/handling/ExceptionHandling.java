package exception.handling;

class MyException extends Exception{
    public String toString(){
        return "My new Exception";
    }
}

public class ExceptionHandling {
    
    public static void meth1() throws Exception{
    int x =10;
    int y=01 ;
    if(x<=0||y<=0) throw new MyException();
    System.out.println(x*y);
    }
    public static void meth2() throws Exception{meth1();}
    public static void meth3()throws Exception{meth2();}
    

    public static void main(String[] args) {
        try{
            meth3();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("The result is returned");
        }
    }
    
}
