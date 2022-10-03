package interfaces;

interface Test {
    void meth1();
    void meth2();
}

interface Member{
    public void callback();
}

class Store{
    Member members[] = new Member[10];
    int count=0;
    
    void register(Member m){
        members[count++]=m;
    }
    
    void inviteSale(){
        for(int i=0;i<count;i++){
            members[i].callback();
        }
    }
}

class Customer implements Member{
    String name;
    
    Customer(String s){
        this.name = s;
    }
    
    @Override
    public void callback(){
        System.out.println("Ok,I will visit,"+name);
    }
}

class My implements Test{
    @Override
    public void meth1(){
        System.out.println("Meth1");
    }
    
    @Override
    public void meth2(){
        System.out.println("Meth2");
    }
    
    public void meth3(){
        System.out.println("Meth3");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        Store s = new Store();
        Customer c1= new Customer("mohammed");
        Customer c2= new Customer("obaid");
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();
    }
    
}
