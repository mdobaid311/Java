package multithreading;
class MyThread extends Thread{
    @Override
    public void run(){
        int i=1;
        while(true){
           try{
                System.out.println(i);
            i+=2;
            Thread.sleep(1000);
           }catch(Exception e){
               System.out.println(e);
           }
        }
    }
    
    public MyThread(String name){
        super(name);
    }
}

    class MyData{
     synchronized  void display(String str){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i));
            }
            System.out.println("");
        }
    }    
    
    class Thread1 extends Thread{
        MyData d;
        public Thread1(MyData d){
            this.d=d;
        }
        
        public void run(){
            d.display("Hello world");
        }
    }
    class Thread2 extends Thread{
        MyData d;
        public Thread2(MyData d){
            this.d=d;
        }
        @Override
        public void run(){
            d.display("Welcome");
        }       
    }

public class MultiThreading extends Thread{

    public static void main(String[] args) {
//        MyThread t = new MyThread("My thread 1");
//        t.start();
//        MultiThreading mt = new MultiThreading();
//        mt.start();
//        mt.setDaemon(true);
////        System.out.println(t.getState());
////        System.out.println("world");
////        System.out.println(t.getClass());
////        System.out.println(t.getId());
////        System.out.println(t.getName());
////        System.out.println(t.getPriority());
////        t.setName("new name");
////        System.out.println(t.getName());
//        
//        }
//        int i=2;
//        @Override
//        public void run(){
//            while(i<10){ 
//           try{
//                System.out.println(i);
//                Thread.sleep(1000);
//                i+=2;
//           }catch(InterruptedException e){
//               System.out.println(e);
//           }
//        }
    MyData d = new MyData();
    Thread1 t1 = new Thread1(d);
    Thread2 t2 = new Thread2(d);
    t1.start();
    t2.start();
    }
        

}
