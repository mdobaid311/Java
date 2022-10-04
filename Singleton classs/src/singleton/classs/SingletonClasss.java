package singleton.classs;

class CoffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float sugarQty;
    
    static private CoffeeMachine my = null;
    
    private CoffeeMachine(){
        coffeeQty=1;
        milkQty=1;
        sugarQty=1;
    }
    
    public float getCoffee(){
        return 0.15f;
    }
    
    static CoffeeMachine getInstance()
    {
        if(my==null)
            my = new CoffeeMachine();
        return my;
    }
    
}

public class SingletonClasss {

    public static void main(String[] args) {
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        
        System.out.println(c1==c2);
    }
    
}
