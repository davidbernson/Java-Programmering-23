package codealongs.Collection.finished;
import java.util.*;

public class ListTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("David");
        names.add("Maria");
        names.add("Tomas");
        names.add("George");
        names.add("Sophie");

        System.out.println(names);

        names.add("David");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        List<String> otherNames = new ArrayList<String>();

        otherNames.add("Ophelia");
        otherNames.add("Hamlet");

        System.out.println(
            "Are the two Lists disjoint: " +     
            Collections.disjoint(names, otherNames)
        );

        int index = Collections.binarySearch(names, "Sophie");

        System.out.println("Sophie is found at index: " + index);

        Collections.swap(names, 1, 5);

        System.out.println(names);
    }
}