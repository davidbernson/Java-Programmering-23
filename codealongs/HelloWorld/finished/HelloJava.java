package codealongs.HelloWorld.finished;

import javax.swing.*;

public class HelloJava {
  public static void main(String[] args) {
    String message = "Hello Mjukvarutestare!";
    
    JFrame frame = new JFrame("Hello, Java!");
    frame.setSize(350, 250);
    JLabel label = new JLabel(message, JLabel.CENTER);
    frame.add(label);
    frame.setVisible(true);
  }
}