public class Sum {
    // Method to calculate sum of two numbers
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Example numbers
        int number1 = 10;
        int number2 = 20;
        
        // Calculate sum
        int sum = calculateSum(number1, number2);
        
        // Print the result
        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}
