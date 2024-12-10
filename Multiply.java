public class Multiply {
    public static void main(String[] args) {
        // Assigning values directly to num1 and num2 (no user input)
        int num1 = 5;
        int num2 = 10;
        
        // Performing multiplication
        int result = multiply(num1, num2);
        
        // Display the result
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
    }

    // Function to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }
}

