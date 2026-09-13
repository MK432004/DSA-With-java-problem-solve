package recursionproblem;
// This code calculates the factorial of a number using recursion
// It defines a method to compute the factorial and prints the result for a given number
// This code calculates the sum of first n natural numbers using recursion
// It defines a method to compute the sum and prints the result for a given n
// package recursionproblem;
// This code calculates the sum of first n natural numbers using recursion  
// It defines a method to compute the sum and prints the result for a given n
// package recursionproblem;
// This code calculates the sum of first n natural numbers using recursion
// It defines a method to compute the sum and prints the result for a given n
// package recursionproblem;
public class recursion {
    // print sum of first n natural numbers
    public static void printsum(int i, int n, int sum) {
        if (i == n) {
           sum += i; // Add the last number to sum
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
            return; // Base case
        }
        sum += i; // Add current number to sum
        printsum(i + 1, n, sum); // Recursive call with next number

      
    }
    public static void main(String[] args) {
        
        printsum(1, 5, 0); // Start from 1, with initial sum as 0
    }
}
    

    