package collections;
import java.util.*;
class My implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if(i1<i2) return 1;
        if(i1>i2) return -1;
        return 0;
    }
}

public class Collections {

    public static void main(String[] args) {
        Integer a[] = {2,5,1,6,1,7,3,3,10};
        Arrays.sort(a,new My());
        System.out.println(Arrays.toString(a));
    }
    
}
