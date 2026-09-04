package DAY4.SESSION2;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyAnalysis {

    public static void main(String[] args) {
        String [] words = {"c","a","b","a","c","a"};

        // Remove punctuation and convert to lowercase
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        //1. frequency printing;
        System.out.println("Word Frequencies:");

        // 2. the freq elemnt;
        int maxcount = 0;
        String mostFrequentWord = "";
        for(Map.Entry <String,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if(entry.getValue() >  maxcount){
                maxcount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        System.out.println( mostFrequentWord );
        System.out.println( maxcount );

        System.out.println("Unique Words:");
        for(Map.Entry <String,Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
}
}

