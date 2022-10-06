package itc;

class MyData{
    int value = 0;
    boolean flag =true;
    
    synchronized void set(int x){
        try{
            while(flag!=true) wait();
            value = x;
            flag = false;
            notify();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    
    synchronized int get(){
        int x =0;
        try{
            while(flag!=false) wait();
            x=value;
            flag=true;
            notify();
        }catch(Exception e){
            System.out.println(e);
        }
        return x;
    }
    
} 

class Producer extends Thread{
    MyData d;
    
    public Producer(MyData d){
        this.d=d;
    }
    
    @Override
    public void run(){
        int i=1;
        while(true){
            try{
            d.set(i);
            System.out.println(Thread.currentThread().getId() +" Producer: "+i);
            Thread.sleep(1000);
            i++;
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread{
    MyData d;

    public Consumer(MyData d) {
        this.d=d;
    }
    
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getId() +" Consumer: "+d.get());
        }
    }
    
}

public class ITC {

    public static void main(String[] args) {
        MyData data = new MyData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        Consumer c1 = new Consumer(data);
        
        p.start();
        c.start(); 
        c1.start(); 
    }
    
}
