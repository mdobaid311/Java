package generics;

class MyArray<T extends Number>{
    T[] objs =(T[]) new Object[10];
    int count=0;
    public void append(T obj){
        objs[count]=obj;
        count++;
    }
    
    public void getObjs(){
        for(int i=0;i<count;i++){
            System.out.println(objs[i]);
        }
    }
    
    
}

class MyClass2 extends MyArray<Integer>{
    
}

class MyClass<T extends String>{
    
}

public class Generics {
    
    static <E> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
//       MyClass2 m = new MyClass2();
//       m.append(20);
//       m.append(10);
//       m.append(50);
//       m.append(80);
//       m.getObjs();
       
       show(new Integer[]{10,2,2,42});
       show(new String[]{"hello","world"});
    }
}
