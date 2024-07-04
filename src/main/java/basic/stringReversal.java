package basic;

import java.util.Stack;

/*
Write a Program to reverse string as per below scenario:
Input String “Java Learning”
Output String “gninreaL avaJ”
Without Using charAt() function
With Using charAt() function
 */
public class stringReversal {
    public static void main(String[] args) {
        String original ="Java Learning";
        System.out.println("original : "+original);

        withoutCharAtReversal(original);
        withCharAtReversal(original);
    }

    private static void withCharAtReversal(String original) {
        System.out.println("With Char At Method");
        String reversed="";

        for(int i=original.length()-1; i>=0; i--) {
            reversed = reversed+original.charAt(i);
        }

        System.out.println("revered"+reversed);

    }

    private static void withoutCharAtReversal(String original) {
        System.out.println("Without Char at method");

        Stack<Character> stack = new Stack<>();
        String reversed ="";

        for (char c:original.toCharArray()){

        stack.push(c);
        }

        while (!stack.isEmpty()){
            reversed= reversed+stack.pop();
        }

        System.out.println("revered"+reversed);
    }
}
