package DAY4.SESSION3;

import java.util.HashMap;
import java.util.Map;

public class ContentAnalytics {
    public static void main(String[] args) {
        String content = "This is a sample content for analysis. It contains words, punctuation, and other elements.";
        
        // Remove punctuation and convert to lowercase
        String cleanedContent = content.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        
        // Split the content into words
        String[] words = cleanedContent.split("\\s+");
        
        // Count word frequencies
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        // Print word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    
}
