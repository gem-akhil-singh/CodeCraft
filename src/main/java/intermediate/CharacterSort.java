package intermediate;

import java.util.Arrays;

public class CharacterSort {
    public static void main(String[] args) {

        char[] charArray = {'a', 'Z', 'b', 'A', 'c', 'C'};

        System.out.println("Original Array: " + Arrays.toString(charArray));

        Arrays.sort(charArray); // Default sort is in increasing order

        // Reverse the sorted array to get decreasing order
        reverseArray(charArray);

        // Print the sorted array
        System.out.println("Array in Decreasing ASCII Order: " + Arrays.toString(charArray));
    }


    public static void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
