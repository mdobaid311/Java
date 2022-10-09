package dataio.challenge;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

 class Customer implements Serializable{
            String cusId;
            String name;
            String phno;
            
            static int count=1;
            
            Customer(){
                
            }
            Customer(String n,String p){
                cusId="C"+count;
                count++;
                name=n;
                phno=p;
            }
            
            public String toSting(){
                return "Customer ID: "+cusId+"\nName:"+name+"\nPhno: "+phno+"\n";
            }
        }

public class DataIOChallenge {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//       Customer list[] = {new Customer("Mohammed","9515281551"),new Customer("Obaid","9515281461")};
//        FileOutputStream fos =new FileOutputStream("F:/Java/Customers.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        
//        oos.writeInt(list.length);
//        for(Customer c:list)
//            oos.writeObject(c);
//        oos.close();
//        fos.close();

        FileInputStream fin = new FileInputStream("F:/Java/Customers.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);
        
        Scanner sc = new Scanner(System.in);
        int length = ois.readInt();
        Customer [] list = new Customer[length];
        
        for(int i=0;i<length;i++){
            list[i] = (Customer)ois.readObject();
        }
        System.out.println("Enter customer name");
        String name =sc.nextLine();
        
        for(int i=0;i<length;i++){
            if(name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i].toSting());
        }
        ois.close();
        fin.close();
    }    
    
    
}
