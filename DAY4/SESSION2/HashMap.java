
package DAY4.SESSION2;
import java.util.ArrayList;

public class HashMap {
    public static void main(String[] args) {

        String[] words = {
            "apple", "banana", "apple",
            "cherry", "banana", "apple"
        };

        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();

        // Count frequency
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Display frequencies
        System.out.println("Frequencies:");
        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }

        // Find most frequent word
        String mostFrequent = "";
        int max = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                mostFrequent = word;
            }
        }

        System.out.println("Most Frequent Word: " + mostFrequent);

        // Find unique words
        ArrayList<String> unique = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                unique.add(word);
            }
        }

        System.out.println("Unique Words: " + unique);
    }
}
