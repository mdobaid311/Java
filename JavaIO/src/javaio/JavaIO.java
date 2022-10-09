package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.*; 

public class JavaIO {

    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("F:/Java/Test.txt");
            FileInputStream f2 = new FileInputStream("F:/Java/copy.txt");
            
            SequenceInputStream sq = new SequenceInputStream(f1,f2);
            
            FileOutputStream fos = new FileOutputStream("F:/Java/Dest.txt");
           int x;
           while((x=sq.read())!=-1)
            fos.write(x);
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
