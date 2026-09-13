package recursionproblem;
// This code calculates the factorial of a number using recursion
// It defines a method to compute the factorial and prints the result for a given number


public class printfactorial {
    // Function to calculate factorial using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Base case: factorial of 0 or 1 is 1
            return 1;
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        int result = factorial(number); // Call the recursive function
        System.out.println("The factorial of " + number + " is: " + result); // Print the result
    }
    
}
