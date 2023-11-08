package codealongs.Collection.finished;
import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> turordning = new LinkedList<String>();

        turordning.add("David");
        turordning.add("Emma");
        turordning.add("Marcus");
        turordning.add("Maria");
        turordning.add("Tomas");

        System.out.println(turordning);

        String nextInLine = turordning.poll();
        System.out.println(nextInLine);

        System.out.println(turordning);

        nextInLine = turordning.peek();
        System.out.println(nextInLine);

        System.out.println(turordning);

        turordning.offer("David");

        System.out.println(turordning);
        
        Deque<String> turordning2 = new LinkedList<String>();

        turordning2.add("David");
        turordning2.add("Emma");
        turordning2.add("Marcus");
        turordning2.add("Maria");
        turordning2.add("Tomas");

        System.out.println(turordning2);

        turordning2.addLast("John");
        turordning2.addFirst("Jessica");

        System.out.println(turordning2);

        System.out.println(turordning2.peekFirst() + " is first in line.");
        System.out.println(turordning2.peekLast() + " is last in line.");

        String first = turordning2.pollFirst();
        String last = turordning2.pollLast();

        System.out.println(first + " and " + last + " were dropped from the Queue.");
        System.out.println(turordning2.peekFirst() + " is first in line.");
        System.out.println(turordning2.peekLast() + " is last in line.");

    }
}
