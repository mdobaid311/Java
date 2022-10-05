package exception.exercise;

class StackOverflow extends Exception{
    @Override
    public String toString(){
        return "Stack is full";
    }
}
class StackUnderflow extends Exception{
    @Override
    public String toString(){
        return "Stack is empty";
    }
}

class Stack{
    public int size;
    int[] stack;
    int count=0;
    public Stack(int size){
        this.size=size;
        stack = new int[size];
    }
    
    
    public void push(int x) throws Exception{
        if(count>=size) throw new StackOverflow();
        else {stack[count]=x; count++;}
    }
    
    public int pop() throws Exception{
        if(count<=0) throw new StackUnderflow();
        else {
            count--;}
            return stack[count]; 
    }
    
    public void display(){
        for(int i=0;i<stack.length;i++){
            System.out.println(stack[i]);
        }
    }
}

public class ExceptionExercise {

    public static void main(String[] args) {
        try{
            Stack stack = new Stack(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.display();
            stack.push(5);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
