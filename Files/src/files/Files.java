package files;

import java.io.File;
import java.util.*;

public class Files {

    public static void main(String[] args) {
        File f = new File("F:/Java");
        String[] file = f.list();
        System.out.println(Arrays.toString(file));
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.isHidden());
        System.out.println(f.isAbsolute());
        System.out.println(f.getClass());
        File[] files = f.listFiles();
        
        for(File x:files){
            System.out.print(f.getName()+" ");
            System.out.print(x.getPath()+" ");
            System.out.print(x.lastModified()+" ");
            System.out.println(x.getParent()+" ");
        }
    }
    
}
