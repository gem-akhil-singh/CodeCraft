package intermediate;

import java.util.ArrayList;
import java.util.List;

public class FindIntegersInStringWithoutRegex {
    public static void main(String[] args) {
        String input = "1abc35de New Test1abc 11 55 22 New Test";
        List<Integer> integers = findIntegers(input);


        System.out.println("Integers found in the input string:");
        for (int num : integers) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findIntegers(String input) {
        List<Integer> integers = new ArrayList<>();
        StringBuilder numStr = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numStr.append(c);
            } else {
                if (numStr.length() > 0) {
                    integers.add(Integer.parseInt(numStr.toString()));
                    numStr.setLength(0); // Clear numStr
                }
            }
        }


        if (numStr.length() > 0) {
            integers.add(Integer.parseInt(numStr.toString()));
        }

        return integers;
    }
}

