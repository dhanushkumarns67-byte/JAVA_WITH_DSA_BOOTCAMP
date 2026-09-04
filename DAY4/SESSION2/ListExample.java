package DAY4.SESSION2;
import java.util.ArrayList;
import java.util.List;
//list
//interfaces with store ordered collection of elements but dynamic
//allow duplicate.null
//supports index based access
//index starts from 0
public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Dhanush");
        names.add("Dhanush");
        names.add("Dhruv");
        names.add("Dacchu");
        names.add("Jashwanth");
        names.add("Bob");

        System.out.println(names);
        System.out.println(names.get(1));

        // Update the list.
        names.set(1, "Alice");
        System.out.println(names);
        names.remove("Bob");
        System.out.println(names);

        System.out.println("Printing using the loop below");
        for (String name : names) {
            System.out.println(name);
        }
    }
}