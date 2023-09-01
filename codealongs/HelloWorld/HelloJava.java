
import javax.swing.*;

public class HelloJava{
    public static void main(String[] args) {
     String message = "Hello world!";
     String title = "Hello window";

     JFrame frame = new JFrame(title);
     frame.setSize(350, 250);

     

     JLabel label = new JLabel(message, JLabel.CENTER);

     frame.add(label);

     frame.setVisible(true);



     
    }
}