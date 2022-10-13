package generics;

class MyArray<T>{
    T[] objs =(T[]) new Object[10];
    int count=0;
    public void append(T obj){
        objs[count]=obj;
        count++;
    }
    
    public void getObjs(){
        for(int i=0;i<objs.length;i++){
            System.out.println(objs[i]);
        }
    }
}

public class Generics {

    public static void main(String[] args) {
       MyArray<Integer> m = new MyArray<>();
       m.append(20);
       m.append(10);
       m.append(50);
       m.append(80);
       m.getObjs();
    }
}
