package multithreading;
class MyThread implements Runnable{
    @Override
    public void run(){
        for(int i=0;;i++){
            System.out.println("Haula");
        }
    }
}


public class MultiThreading {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread th = new Thread(t);
        th.start();
        for(int i=0;;i++){
            System.out.println("Omer");
        }
        
         
    }
    
}
