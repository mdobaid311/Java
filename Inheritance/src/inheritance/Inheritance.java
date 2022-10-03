
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

class Account{
    public int accno,phno,balance;
    public String name,address,dob;
    
    public Account(int accno,int phno,int balance,String name,String address,String dob){
        this.accno  = accno;
        this.phno = phno;
        this.balance = balance;
        this.name = name;
        this.dob=dob;
        this.address = address;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public int getAccno(){
        return accno;
    }
   
}

class SavingsAccount extends Account{
    private int FDAmount;
    
   public SavingsAccount(int accno,int phno,int balance,String name,String address,String dob){
       super(accno,phno,balance,name,address,dob);
   }
    
    public void deposit(int amount){
        balance+=amount;
    }
    
    public void withdraw(int amount){
        balance-=amount;
    }
    
    public void FixedDeposit(int amount){
        FDAmount = amount;
        balance-=amount;
    }
    
    public int getFDAmount(){
        return FDAmount;
    }
    
}




public class Inheritance {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1234, 9515, 10000, "Mohammed obaid", "baba nagar", "14-08-2000");
        
        System.out.println(sa.getBalance());
        sa.deposit(2000);
        System.out.println(sa.getBalance());
        sa.withdraw(1200);
        System.out.println(sa.getBalance());
        sa.FixedDeposit(5000);
        System.out.println(sa.getBalance());
        System.out.println(sa.getFDAmount());
    }
    
}
