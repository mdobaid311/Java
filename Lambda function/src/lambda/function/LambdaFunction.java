package lambda.function;

interface MyLambda{
    public void display();
}

public class LambdaFunction {

    public static void main(String[] args) {
        MyLambda m = ()->{
        System.out.println("hello world");};
        m.display();
    }
    
}
