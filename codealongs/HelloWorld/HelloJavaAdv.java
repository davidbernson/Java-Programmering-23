
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJavaAdv{
    public static void main(String[] args) {

     JFrame frame = new JFrame("Hello Window");
     frame.setSize(350, 250);
     frame.add(new HelloComponent("Hello Mjukvarutestare!"));
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
     
    }
}

  class HelloComponent extends JComponent
        implements MouseMotionListener {
            String theMessage;
            int messageX = 125, messageY = 95;

            public HelloComponent(String message){
                theMessage = message;
                addMouseMotionListener(this);
            }

            public void paintComponent(Graphics g) {
            g.drawString(theMessage, messageX, messageY);
        }


            public void mouseDragged(MouseEvent e){
                messageX = e.getX();
                messageY = e.getY();
                repaint();
            }

            public void mouseMoved(MouseEvent e){ }

           
        }



        
