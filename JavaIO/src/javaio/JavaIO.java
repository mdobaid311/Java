package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*; 

public class JavaIO {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("F:/Java/Test.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            System.out.println(new String(b));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
