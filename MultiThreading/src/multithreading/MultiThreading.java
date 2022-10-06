package multithreading;
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello");
    }
    
    public MyThread(String name){
        super(name);
    }
}


public class MultiThreading {

    public static void main(String[] args) {
        MyThread t = new MyThread("My thread 1");
        t.start();
        System.out.println(t.getState());
        System.out.println("world");
        System.out.println(t.getClass());
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setName("new name");
        System.out.println(t.getName());
    }
    
}
