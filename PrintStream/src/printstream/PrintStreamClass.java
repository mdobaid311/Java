package printstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class PrintStreamClass {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fs = new FileOutputStream("F:/Java/Text.txt");
        PrintStream ps = new PrintStream(fs);
        
        ps.print("Hello ");
        ps.print("My name is ");
        ps.print("Obaid");
        
        FileInputStream fis = new FileInputStream("F:/Java/Text.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        
        System.out.println(br.readLine());
        ps.close();
    }
    
}
