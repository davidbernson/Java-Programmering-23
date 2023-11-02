package codealongs.Polymorphism.finished;

public class Robot implements Talking {
    
    public void talk(String message) {
        System.out.println("Message received. Generating voice output...");
        if (message.length() < 25) {
            System.out.println(message);
        } else {
            System.out.println("Error. Message too long for voice model!");
        }
    }
}
