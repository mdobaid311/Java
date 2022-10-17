package buttonevent;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
   int count =0; 
   Label l ;
   Button b;
   
   public MyFrame(){
       super("Button Demo");
       l = new Label("  "+count);
       b = new Button("Click");
       
       setLayout(new FlowLayout());
       add(l);
       add(b);
       
       b.addActionListener(l);
   }
   
}

public class ButtonEvent {

    public static void main(String[] args) {
        
    }
}
