package javapackages;

class MyObject{
    @Override
    public String toString(){
        return "My Object";
    }
    @Override
    public int hashCode(){
        return 100;
    }
    @Override
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
}

public class Javapackages {
    
    public static void main(String[] args) {
        Integer m1 = Integer.valueOf("15");
        String m2=Integer.toBinaryString(m1);
        System.out.println(Integer.valueOf(m2));
        System.out.println(Integer.bitCount(m1));
    }
    
}
