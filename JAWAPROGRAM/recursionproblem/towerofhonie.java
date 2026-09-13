package recursionproblem;

public class towerofhonie {

    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        // Base case: If there's only one disk, move it directly from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        // Move n-1 disks from source to helper
        towerOfHanoi(n - 1, source, helper, destination);
        
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        // Move the n-1 disks from helper to destination
        towerOfHanoi(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, "A", "C", "B"); // A is source, C is destination, B is auxiliary
    }
    
}
