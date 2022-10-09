package pipes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
    OutputStream os;

    public Producer(OutputStream os) {
        this.os = os;
    }
    
    public void run(){
        int count =1;
        while(true){
            try{
                os.write(count);
                os.flush();
                System.out.println("Producer "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread{
    InputStream is;

    public Consumer(InputStream is) {
        this.is = is;
    }
    
    public void run(){
        int x;
        while(true){
            try{
                x=is.read();
                System.out.println("Consumer "+x);
                System.out.flush();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


public class Pipes {

    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis);
        
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        
        p.start();
        c.start();
    }
    
}
