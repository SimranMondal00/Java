package LeetCodeSollutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharByFrequency {

    public String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Create a list of characters sorted by frequency
        List<Character> sortedChars = new ArrayList<>(frequencyMap.keySet());
        sortedChars.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // Build the result string based on the sorted characters
        StringBuilder result = new StringBuilder();
        for (char ch : sortedChars) {
            int frequency = frequencyMap.get(ch);
            for (int i = 0; i < frequency; i++) {
                result.append(ch);
            }

        }
        return result.toString();
    }
}