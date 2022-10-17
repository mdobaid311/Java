package textfielddemo;


import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements TextListener,ActionListener{
    Label l1,l2;
    TextField tf;
    
    public MyFrame(){
        l1= new Label("Enter text in the text field");
        l2= new Label("Hit enter to change text");
        tf= new TextField();
        tf.setEchoChar('*');
        
        tf.addTextListener(this);
        tf.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }
    
    @Override
    public void textValueChanged(TextEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

public class TextFieldDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
