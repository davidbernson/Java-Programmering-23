package codealongs.Exception.finished;
public class CallStack {
    
    public double topMethod() {
        return 1 / 0;
    }

    public void middleMethod() {
        topMethod();
    }

    public void bottomMethod() {
        middleMethod();
    }

    public static void main(String[] args) {
        CallStack c = new CallStack();
        
        c.bottomMethod();
    }
}
