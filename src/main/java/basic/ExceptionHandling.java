package basic;

public class ExceptionHandling {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result = 0;

        try {
            // Attempting to divide by zero
            result = numerator / denominator;
        } catch (ArithmeticException e) {
            // Handling the divide-by-zero exception
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            // This block always executes
            System.out.println("This is the finally block. It always executes.");
        }

        // Further code execution
        System.out.println("Result: " + result);
        System.out.println("Program execution continues...");
    }
}
