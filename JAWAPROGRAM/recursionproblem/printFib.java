package recursionproblem;
// This code calculates the factorial of a number using recursion
// It defines a method to compute the factorial and prints the result for a given number
// This code calculates the sum of first n natural numbers using recursion
// It defines a method to compute the sum and prints the result for a given n
// package recursionproblem;
// This code calculates the sum of first n natural numbers using recursion





public class printFib {
    // Function to print Fibonacci series using recursion
    public static void printfib(int a, int b, int n) {
        if (n == 0) {
            return; // Base case: no more numbers to print
        }
        int c = a + b; // Calculate the next number in the series
        System.out.println(c); // Print the next number
        printfib(b, c , n-1); // Recursive call with updated parameters
    
    }
    public static void main(String[] args) {
       int a=0; // First number in Fibonacci series
       int b=1; // Second number in Fibonacci series
       System.out.println(a);
       System.out.println(b);
       int n = 7; // Number of terms to print in Fibonacci series
        printfib(a,b , n-2); // Print the next number in the series
      
    }
    
}