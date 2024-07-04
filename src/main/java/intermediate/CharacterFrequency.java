package intermediate;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "testtest new test done";
        Map<Character, Integer> frequencyMap = calculateCharacterFrequency(input);

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time(s)");
        }
    }

    public static Map<Character, Integer> calculateCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        input = input.toLowerCase();

        for (char c : input.toCharArray()) {

                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

        }

        return frequencyMap;
    }
}

