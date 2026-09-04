package DAY4.SESSION2;
import java.util.ArrayList;

public class StudentRoster {
    public static void main(String[] args) {

        ArrayList<String> roster = new ArrayList<>();

        // Add students
        roster.add("Alice");
        roster.add("Bob");
        roster.add("Charlie");

        System.out.println("Roster: " + roster);

        // Insert Diana at index 1
        roster.add(1, "Diana");
        System.out.println("After Insert: " + roster);

        // Remove Bob
        roster.remove("Bob");
        System.out.println("After Remove: " + roster);

        // Check Diana
        System.out.println("Contains 'Diana': " + roster.contains("Diana"));

        // Find Charlie's index
        System.out.println("Index of 'Charlie': " + roster.indexOf("Charlie"));
    }
}