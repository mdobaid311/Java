package textfielddemo;


import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements TextListener,ActionListener{
    Label l1,l2;
    TextField tf;
    
    public MyFrame(){
        l1= new Label("Enter text in the text field");
        l2= new Label("Hit enter to change text");
        tf= new TextField(20);
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
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         l2.setText(tf.getText());
    }
    
}

public class TextFieldDemo {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
