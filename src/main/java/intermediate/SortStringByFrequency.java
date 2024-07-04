package intermediate;

import java.util.*;

public class SortStringByFrequency {
    public static void main(String[] args) {
        String input = "Kapoor";
        String output = sortStringByFrequency(input);
        System.out.println("Input String: " + input);
        System.out.println("Output String: " + output);
    }

    public static String sortStringByFrequency(String input) {

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }


        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        Collections.sort(entryList, (e1, e2) -> {
            int freqCompare = e2.getValue().compareTo(e1.getValue()); //
            return (freqCompare == 0) ? e1.getKey().compareTo(e2.getKey()) : freqCompare;
        });

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char c = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
